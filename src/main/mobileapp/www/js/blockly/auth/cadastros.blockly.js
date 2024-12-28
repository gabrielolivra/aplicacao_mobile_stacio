window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.auth = window.blockly.js.blockly.auth || {};
window.blockly.js.blockly.auth.Cadastros = window.blockly.js.blockly.auth.Cadastros || {};

/**
 * @function cadastrar_consulta
 *
 *
 *
 * @param data_consulta
 * @param id_dentista
 * @param observacoes
 * @param id_paciente
 * @param status
 * @param tipo_consulta
 * @param forma_pagamento
 * @param valor
 *
 * @author Gabriel Bernardino De Oliveira
 * @since 28/12/2024, 09:52:45
 *
 */
window.blockly.js.blockly.auth.Cadastros.cadastrar_consultaArgs = [{ description: 'data_consulta', id: '469b1bba' }, { description: 'id_dentista', id: 'c397ddf1' }, { description: 'observacoes', id: '1fef6d37' }, { description: 'id_paciente', id: 'f556a91d' }, { description: 'status2', id: 'c2e61586' }, { description: 'tipo_consulta', id: '22a6bb96' }, { description: 'forma_pagamento', id: '6536e8b9' }, { description: 'valor', id: '894c26c9' }];
window.blockly.js.blockly.auth.Cadastros.cadastrar_consulta = async function(data_consulta, id_dentista, observacoes, id_paciente, status2, tipo_consulta, forma_pagamento, valor) {
 var status;
  //
  this.cronapi.util.callServerBlocklyAsynchronous('blockly.Cadastros:cadastrar_agendamento', async function(sender_item) {
      item = sender_item;
    //
    if (item) {
      //
      this.cronapi.notification.confirmDialogAlert('success', 'Sucesso', 'Consulta agendada com sucesso!', this.cronapi.notification.buttonConfirmDialogAlert('true', 'Ok', async function() {
         //
        this.cronapi.screen.changeView("#/app/logged/home",[  ]);
       }.bind(this)));
    }
  }.bind(this), data_consulta, id_dentista, observacoes, id_paciente, status2, tipo_consulta, forma_pagamento, valor);
}

/**
 * @function cadastrar_cliente
 *
 *
 *
 * @param cpf
 * @param data_nascimeto
 * @param email
 * @param endereco
 * @param nome
 * @param telefone
 *
 * @author Gabriel Bernardino De Oliveira
 * @since 28/12/2024, 09:52:45
 *
 */
window.blockly.js.blockly.auth.Cadastros.cadastrar_clienteArgs = [{ description: 'cpf', id: '3cb692de' }, { description: 'data_nascimeto', id: '380e232a' }, { description: 'email', id: 'd549a0e3' }, { description: 'endereco', id: 'adea8aea' }, { description: 'nome', id: 'cb0647f1' }, { description: 'telefone', id: 'ad8d71df' }];
window.blockly.js.blockly.auth.Cadastros.cadastrar_cliente = async function(cpf, data_nascimeto, email, endereco, nome, telefone) {
 var data_consulta, id_dentista, observacoes;
  //
  this.cronapi.util.callServerBlocklyAsynchronous('blockly.Cadastros:cadastrar_paciente', async function(sender_item) {
      item = sender_item;
    //
    if (item) {
      //
      this.cronapi.screen.changeValueOfField("vars.cpf_paciente", '');
      //
      this.cronapi.screen.changeValueOfField("vars.data_nascimento_paciente", '');
      //
      this.cronapi.screen.changeValueOfField("vars.email_paciente", '');
      //
      this.cronapi.screen.changeValueOfField("vars.endereco_cliente", '');
      //
      this.cronapi.screen.changeValueOfField("vars.nome_paciente", '');
      //
      this.cronapi.screen.changeValueOfField("vars.telefone_cliente", '');
      //
      this.cronapi.notification.confirmDialogAlert('success', 'Sucesso', 'Cadastro de paciente realizado com sucesso!', this.cronapi.notification.buttonConfirmDialogAlert('true', 'Ok', async function() {
         //
        this.cronapi.screen.hideIonicModal('modalCliente');
       }.bind(this)));
    }
  }.bind(this), cpf, data_nascimeto, email, endereco, nome, telefone);
}

/**
 * @function cadastrar_dentista
 *
 *
 *
 * @param crm
 * @param email
 * @param especialidade
 * @param nome
 * @param telefone
 *
 * @author Gabriel Bernardino De Oliveira
 * @since 28/12/2024, 09:52:45
 *
 */
window.blockly.js.blockly.auth.Cadastros.cadastrar_dentistaArgs = [{ description: 'crm', id: '1a248cc1' }, { description: 'email', id: 'd19f4dbc' }, { description: 'especialidade', id: '058f87b7' }, { description: 'nome', id: '2a25241f' }, { description: 'telefone', id: 'e3e78c66' }];
window.blockly.js.blockly.auth.Cadastros.cadastrar_dentista = async function(crm, email, especialidade, nome, telefone) {
 var data_consulta, id_dentista, observacoes, id_paciente;
  //
  this.cronapi.util.callServerBlocklyAsynchronous('blockly.Cadastros:cadastrar_dentista', async function(sender_item) {
      item = sender_item;
    //
    if (item) {
      //
      this.cronapi.screen.changeValueOfField("vars.crm", '');
      //
      this.cronapi.screen.changeValueOfField("vars.especialidade", '');
      //
      this.cronapi.screen.changeValueOfField("vars.email", '');
      //
      this.cronapi.screen.changeValueOfField("vars.nome", '');
      //
      this.cronapi.screen.changeValueOfField("vars.telefone", '');
      //
      this.cronapi.notification.confirmDialogAlert('success', 'Sucesso', 'Dentista cadastrado com sucesso!', this.cronapi.notification.buttonConfirmDialogAlert('true', 'Sim', async function() {
         //
        this.cronapi.screen.hideIonicModal('modalDentista');
       }.bind(this)));
    }
  }.bind(this), crm, email, especialidade, nome, telefone);
}
