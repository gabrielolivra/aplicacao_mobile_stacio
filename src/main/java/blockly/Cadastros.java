package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Cadastros {

public static final int TIMEOUT = 300;

/**
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
 * @since 28/12/2024, 08:28:44
 *
 */
public static Var cadastrar_agendamento(@ParamMetaData(description = "data_consulta", id = "65e3cd5a") Var data_consulta, @ParamMetaData(description = "id_dentista", id = "9caa199c") Var id_dentista, @ParamMetaData(description = "observacoes", id = "06f65799") Var observacoes, @ParamMetaData(description = "id_paciente", id = "e63d6976") Var id_paciente, @ParamMetaData(description = "status", id = "b4828957") Var status, @ParamMetaData(description = "tipo_consulta", id = "4710e059") Var tipo_consulta, @ParamMetaData(description = "forma_pagamento", id = "6dae5243") Var forma_pagamento, @ParamMetaData(description = "valor", id = "08694585") Var valor) throws Exception {
 return new Callable<Var>() {

   private Var id_consulta = Var.VAR_NULL;
   private Var inserir_consulta = Var.VAR_NULL;
   private Var inserir_pagamento = Var.VAR_NULL;

   public Var call() throws Exception {
    id_consulta =
    cronapi.util.Operations.generateUUID();
    inserir_consulta =
    cronapi.database.Operations.insert(Var.valueOf("app.entity.CONSULTAS"),Var.valueOf("id",id_consulta),Var.valueOf("data_consulta",data_consulta),Var.valueOf("deNTISTA",id_dentista),Var.valueOf("observacoes",observacoes),Var.valueOf("paCIENTE",id_paciente),Var.valueOf("status",status),Var.valueOf("tipo_consulta",tipo_consulta));
    inserir_pagamento =
    cronapi.database.Operations.insert(Var.valueOf("app.entity.FORMA_PAGAMENTO"),Var.valueOf("id",
    cronapi.util.Operations.generateUUID()),Var.valueOf("coNSULTAS",id_consulta),Var.valueOf("forma_pagamento",forma_pagamento),Var.valueOf("valor",valor));
    return
Var.VAR_TRUE;
   }
 }.call();
}

/**
 *
 * @param crm
 * @param email
 * @param especialidade
 * @param nome
 * @param telefone
 *
 * @author Gabriel Bernardino De Oliveira
 * @since 28/12/2024, 08:28:44
 *
 */
public static Var cadastrar_dentista(@ParamMetaData(description = "crm", id = "ea7e650b") Var crm, @ParamMetaData(description = "email", id = "fd58198f") Var email, @ParamMetaData(description = "especialidade", id = "4b370e4d") Var especialidade, @ParamMetaData(description = "nome", id = "86fe5a12") Var nome, @ParamMetaData(description = "telefone", id = "a99aa50d") Var telefone) throws Exception {
 return new Callable<Var>() {

   private Var inserirDentista = Var.VAR_NULL;

   public Var call() throws Exception {
    inserirDentista =
    cronapi.database.Operations.insert(Var.valueOf("app.entity.DENTISTA"),Var.valueOf("crm",crm),Var.valueOf("email",email),Var.valueOf("especialidade",especialidade),Var.valueOf("nome",nome),Var.valueOf("telefone",telefone),Var.valueOf("id",
    cronapi.util.Operations.generateUUID()));
    return
Var.VAR_TRUE;
   }
 }.call();
}

/**
 *
 * @param cpf
 * @param data_nascimento
 * @param email
 * @param endereco
 * @param nome
 * @param telefone
 *
 * @author Gabriel Bernardino De Oliveira
 * @since 28/12/2024, 08:28:44
 *
 */
public static Var cadastrar_paciente(@ParamMetaData(description = "cpf", id = "65cbb211") Var cpf, @ParamMetaData(description = "data_nascimento", id = "5059c99e") Var data_nascimento, @ParamMetaData(description = "email", id = "ef8f1e59") Var email, @ParamMetaData(description = "endereco", id = "692cbc31") Var endereco, @ParamMetaData(description = "nome", id = "2e06a259") Var nome, @ParamMetaData(description = "telefone", id = "1e96b810") Var telefone) throws Exception {
 return new Callable<Var>() {

   private Var inserir_paciente = Var.VAR_NULL;

   public Var call() throws Exception {
    inserir_paciente =
    cronapi.database.Operations.insert(Var.valueOf("app.entity.PACIENTE"),Var.valueOf("id",
    cronapi.util.Operations.generateUUID()),Var.valueOf("cpf",cpf),Var.valueOf("data_nascimento",data_nascimento),Var.valueOf("email",email),Var.valueOf("endereco",endereco),Var.valueOf("nome",nome),Var.valueOf("telefone",telefone));
    return
Var.VAR_TRUE;
   }
 }.call();
}

}

