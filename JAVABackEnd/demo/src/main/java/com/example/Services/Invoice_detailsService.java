package com.example.Services;

import java.util.List;

import com.example.Entity.Invoice_details;

public interface Invoice_detailsService 
{

	List<Invoice_details> getAllInvoice_detailss();

	Invoice_details getInvoice_detailsById(int invoice_detailsId);

	Invoice_details addInvoice_details(Invoice_details invoice_details);

	Invoice_details updateInvoice_details(int invoice_detailsId, Invoice_details updatedInvoice_details);

	void deleteInvoice_details(int invoice_detailsId);

}
