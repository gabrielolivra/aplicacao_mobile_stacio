
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
* Classe que representa a tabela CONSULTAS
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"CONSULTAS\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.CONSULTAS")
@CronappTable(role=CronappTableRole.CLASS)
public class CONSULTAS implements Serializable {
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
    @Temporal(TemporalType.TIMESTAMP)
    @CronappColumn(attributeType="DATETIME", label="Data Consulta")
    @Column(name = "data_consulta", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date data_consulta;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Tipo Consulta")
    @Column(name = "tipo_consulta", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String tipo_consulta;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Status")
    @Column(name = "status", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String status;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Observacoes")
    @Column(name = "observacoes", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String observacoes;


    /**
    * @generated
    */
    @OneToOne
    @JoinColumn(name="fk_DENTISTA", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private DENTISTA deNTISTA;


    /**
    * @generated
    */
    @OneToOne
    @JoinColumn(name="fk_PACIENTE", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private PACIENTE paCIENTE;


    /**
    * Construtor
    * @generated
    */
    public CONSULTAS(){
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
    public CONSULTAS setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém data_consulta
    * return data_consulta
    * @generated
    */
    public java.util.Date getData_consulta() {
        return this.data_consulta;
    }

    /**
    * Define data_consulta
    * @param data_consulta data_consulta
    * @generated
    */
    public CONSULTAS setData_consulta(java.util.Date data_consulta) {
        this.data_consulta = data_consulta;
        return this;
    }
    /**
    * Obtém tipo_consulta
    * return tipo_consulta
    * @generated
    */
    public java.lang.String getTipo_consulta() {
        return this.tipo_consulta;
    }

    /**
    * Define tipo_consulta
    * @param tipo_consulta tipo_consulta
    * @generated
    */
    public CONSULTAS setTipo_consulta(java.lang.String tipo_consulta) {
        this.tipo_consulta = tipo_consulta;
        return this;
    }
    /**
    * Obtém status
    * return status
    * @generated
    */
    public java.lang.String getStatus() {
        return this.status;
    }

    /**
    * Define status
    * @param status status
    * @generated
    */
    public CONSULTAS setStatus(java.lang.String status) {
        this.status = status;
        return this;
    }
    /**
    * Obtém observacoes
    * return observacoes
    * @generated
    */
    public java.lang.String getObservacoes() {
        return this.observacoes;
    }

    /**
    * Define observacoes
    * @param observacoes observacoes
    * @generated
    */
    public CONSULTAS setObservacoes(java.lang.String observacoes) {
        this.observacoes = observacoes;
        return this;
    }
    /**
    * Obtém deNTISTA
    * return deNTISTA
    * @generated
    */
    public DENTISTA getDeNTISTA() {
        return this.deNTISTA;
    }

    /**
    * Define deNTISTA
    * @param deNTISTA deNTISTA
    * @generated
    */
    public CONSULTAS setDeNTISTA(DENTISTA deNTISTA) {
        this.deNTISTA = deNTISTA;
        return this;
    }
    /**
    * Obtém paCIENTE
    * return paCIENTE
    * @generated
    */
    public PACIENTE getPaCIENTE() {
        return this.paCIENTE;
    }

    /**
    * Define paCIENTE
    * @param paCIENTE paCIENTE
    * @generated
    */
    public CONSULTAS setPaCIENTE(PACIENTE paCIENTE) {
        this.paCIENTE = paCIENTE;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
CONSULTAS object = (CONSULTAS)obj;
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