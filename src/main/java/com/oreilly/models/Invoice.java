package com.oreilly.models;

import jakarta.persistence.*;

/**
 * model class for the invoice table
 */
@Entity
@Table(name = "invoices")
public class Invoice {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private Long customerId;
    private Long invoiceId;
    private String tenderType;

    /**
    * get the id of the record
    */
    public Long getId() {
        return id;
    }

    /**
    * sets the id of the record
    */
    public void setId(Long id) {
        this.id = id;
    }

    /**
    * get the id of the customer
    */
    public Long getCustomerId() {
        return customerId;
    }

    /**
    * sets the id of the customer
    */
    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    /**
    * get the id of the invoice
    */
    public Long getInvoiceId() {
        return invoiceId;
    }

    /**
    * sets the id of the invoice
    */
    public void setInvoiceId(Long invoiceId) {
        this.invoiceId = invoiceId;
    }
}
