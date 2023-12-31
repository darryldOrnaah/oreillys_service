package com.oreilly.controllers;

import com.oreilly.models.Invoice;
import com.oreilly.repositories.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path = "/invoices")
public class InvoiceController {

    @Autowired
    private InvoiceRepository invoiceRepository;

    /**
     *
     * @param customerId
     * @return all invoices based on customer id passed
     */
    @GetMapping(path = "/all")
    public List<Invoice> getInvoices(@RequestParam(value = "customerId") Long customerId) {
        return invoiceRepository.findByCustomerId(customerId);
    }
}
