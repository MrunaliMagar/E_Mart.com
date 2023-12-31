package com.example.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entity.Invoice_details;
import com.example.Repositories.Invoice_detailsRepository;

@Service
public class Invoice_detailsServiceImpl implements Invoice_detailsService
{
	@Autowired
	private Invoice_detailsRepository indetailRepository;

	@Override
	public List<Invoice_details> getAllInvoice_detailss() {
		// TODO Auto-generated method stub
		return indetailRepository.findAll();
	}

	@Override
	public Invoice_details getInvoice_detailsById(int invoice_detailsId) {
		// TODO Auto-generated method stub
		return indetailRepository.findById(invoice_detailsId).get();
	}

	@Override
	public Invoice_details addInvoice_details(Invoice_details invoice_details) {
		// TODO Auto-generated method stub
		return indetailRepository.save(invoice_details);
	}

	@Override
	public Invoice_details updateInvoice_details(int invoice_detailsId, Invoice_details updatedInvoice_details) {
		
		 Invoice_details existingInvoiceDetails = indetailRepository.findById(invoice_detailsId).orElse(null);

	        if (existingInvoiceDetails != null) {
	            // Update the fields of the existing invoice details with the values from the updated invoice details
	            existingInvoiceDetails.setMrp(updatedInvoice_details.getMrp());
	            existingInvoiceDetails.setCardHolderPrice(updatedInvoice_details.getCardHolderPrice());
	            existingInvoiceDetails.setPointsRedeem(updatedInvoice_details.getPointsRedeem());
	            existingInvoiceDetails.setInvoiceID(updatedInvoice_details.getInvoiceID());
	            existingInvoiceDetails.setProdID(updatedInvoice_details.getProdID());

	            // Save the updated invoice details back to the database
	            return indetailRepository.save(existingInvoiceDetails);
	        }

	        return null;
	}

	@Override
	public void deleteInvoice_details(int invoice_detailsId) {
		Invoice_details c=indetailRepository.findById(invoice_detailsId).get();
		if(c!=null)
		{
			indetailRepository.delete(c);
		}
		
	}

}
