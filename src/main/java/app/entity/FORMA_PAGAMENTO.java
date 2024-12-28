
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
* Classe que representa a tabela FORMA_PAGAMENTO
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"FORMA_PAGAMENTO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.FORMA_PAGAMENTO")
@CronappTable(role=CronappTableRole.CLASS)
public class FORMA_PAGAMENTO implements Serializable {
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
    @CronappColumn(attributeType="DOUBLE", label="Valor", mask="#.#00,00")
    @Column(name = "valor", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Double valor;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Forma Pagamento")
    @Column(name = "forma_pagamento", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String forma_pagamento;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_CONSULTAS", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private CONSULTAS coNSULTAS;


    /**
    * Construtor
    * @generated
    */
    public FORMA_PAGAMENTO(){
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
    public FORMA_PAGAMENTO setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém valor
    * return valor
    * @generated
    */
    public java.lang.Double getValor() {
        return this.valor;
    }

    /**
    * Define valor
    * @param valor valor
    * @generated
    */
    public FORMA_PAGAMENTO setValor(java.lang.Double valor) {
        this.valor = valor;
        return this;
    }
    /**
    * Obtém forma_pagamento
    * return forma_pagamento
    * @generated
    */
    public java.lang.String getForma_pagamento() {
        return this.forma_pagamento;
    }

    /**
    * Define forma_pagamento
    * @param forma_pagamento forma_pagamento
    * @generated
    */
    public FORMA_PAGAMENTO setForma_pagamento(java.lang.String forma_pagamento) {
        this.forma_pagamento = forma_pagamento;
        return this;
    }
    /**
    * Obtém coNSULTAS
    * return coNSULTAS
    * @generated
    */
    public CONSULTAS getCoNSULTAS() {
        return this.coNSULTAS;
    }

    /**
    * Define coNSULTAS
    * @param coNSULTAS coNSULTAS
    * @generated
    */
    public FORMA_PAGAMENTO setCoNSULTAS(CONSULTAS coNSULTAS) {
        this.coNSULTAS = coNSULTAS;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
FORMA_PAGAMENTO object = (FORMA_PAGAMENTO)obj;
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