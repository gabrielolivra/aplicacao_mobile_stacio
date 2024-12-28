
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
* Classe que representa a tabela DENTISTA
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"DENTISTA\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.DENTISTA")
@CronappTable(role=CronappTableRole.CLASS)
public class DENTISTA implements Serializable {
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
    @CronappColumn(attributeType="STRING", label="Especialidade")
    @Column(name = "especialidade", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String especialidade;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Crm")
    @Column(name = "crm", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String crm;


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
    public DENTISTA(){
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
    public DENTISTA setId(java.lang.String id) {
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
    public DENTISTA setNome(java.lang.String nome) {
        this.nome = nome;
        return this;
    }
    /**
    * Obtém especialidade
    * return especialidade
    * @generated
    */
    public java.lang.String getEspecialidade() {
        return this.especialidade;
    }

    /**
    * Define especialidade
    * @param especialidade especialidade
    * @generated
    */
    public DENTISTA setEspecialidade(java.lang.String especialidade) {
        this.especialidade = especialidade;
        return this;
    }
    /**
    * Obtém crm
    * return crm
    * @generated
    */
    public java.lang.String getCrm() {
        return this.crm;
    }

    /**
    * Define crm
    * @param crm crm
    * @generated
    */
    public DENTISTA setCrm(java.lang.String crm) {
        this.crm = crm;
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
    public DENTISTA setTelefone(java.lang.String telefone) {
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
    public DENTISTA setEmail(java.lang.String email) {
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
DENTISTA object = (DENTISTA)obj;
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