
package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;
import cronapi.swagger.CronappSwagger;



import cronapp.framework.core.persistence.*;

/**
* Classe que representa a tabela PACIENTE
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"PACIENTE\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.PACIENTE")
@CronappTable(role=CronappTableRole.CLASS)
public class PACIENTE implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @CronappColumn(attributeType="STRING", label="Id", defaultValue = "UUID.randomUUID().toString().toUpperCase()")
    @Column(name = "id", nullable = false, insertable=true, updatable=true)
        private java.lang.String id = UUID.randomUUID().toString().toUpperCase();


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Nome")
    @Column(name = "nome", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String nome;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Cpf", mask="999.999.999-99;0")
    @Column(name = "cpf", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String cpf;


    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @CronappColumn(attributeType="DATETIME", label="Data Nascimento")
    @Column(name = "data_nascimento", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date data_nascimento;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Endereco")
    @Column(name = "endereco", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String endereco;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Telefone", mask="(00) 00000-0000;0")
    @Column(name = "telefone", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String telefone;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Email")
    @Column(name = "email", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String email;


    /**
    * Construtor
    * @generated
    */
    public PACIENTE(){
    }

    /**
    * Obtém id
    * return id
    * @generated
    */
    public java.lang.String getId() {
        return this.id;
    }

    /**
    * Define id
    * @param id id
    * @generated
    */
    public PACIENTE setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém nome
    * return nome
    * @generated
    */
    public java.lang.String getNome() {
        return this.nome;
    }

    /**
    * Define nome
    * @param nome nome
    * @generated
    */
    public PACIENTE setNome(java.lang.String nome) {
        this.nome = nome;
        return this;
    }
    /**
    * Obtém cpf
    * return cpf
    * @generated
    */
    public java.lang.String getCpf() {
        return this.cpf;
    }

    /**
    * Define cpf
    * @param cpf cpf
    * @generated
    */
    public PACIENTE setCpf(java.lang.String cpf) {
        this.cpf = cpf;
        return this;
    }
    /**
    * Obtém data_nascimento
    * return data_nascimento
    * @generated
    */
    public java.util.Date getData_nascimento() {
        return this.data_nascimento;
    }

    /**
    * Define data_nascimento
    * @param data_nascimento data_nascimento
    * @generated
    */
    public PACIENTE setData_nascimento(java.util.Date data_nascimento) {
        this.data_nascimento = data_nascimento;
        return this;
    }
    /**
    * Obtém endereco
    * return endereco
    * @generated
    */
    public java.lang.String getEndereco() {
        return this.endereco;
    }

    /**
    * Define endereco
    * @param endereco endereco
    * @generated
    */
    public PACIENTE setEndereco(java.lang.String endereco) {
        this.endereco = endereco;
        return this;
    }
    /**
    * Obtém telefone
    * return telefone
    * @generated
    */
    public java.lang.String getTelefone() {
        return this.telefone;
    }

    /**
    * Define telefone
    * @param telefone telefone
    * @generated
    */
    public PACIENTE setTelefone(java.lang.String telefone) {
        this.telefone = telefone;
        return this;
    }
    /**
    * Obtém email
    * return email
    * @generated
    */
    public java.lang.String getEmail() {
        return this.email;
    }

    /**
    * Define email
    * @param email email
    * @generated
    */
    public PACIENTE setEmail(java.lang.String email) {
        this.email = email;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
PACIENTE object = (PACIENTE)obj;
        if (id != null ? !id.equals(object.id) : object.id != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

}