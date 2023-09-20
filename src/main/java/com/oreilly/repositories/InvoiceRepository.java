package com.oreilly.repositories;

import com.oreilly.models.Invoice;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * repository for retrieving objects
 */
@Repository
public interface InvoiceRepository extends CrudRepository<Invoice, String> {

    List<Invoice> findByCustomerId(Long customerId);
}
