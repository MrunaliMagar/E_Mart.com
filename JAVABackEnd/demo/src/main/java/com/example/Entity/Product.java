package com.example.Entity;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "Product")
public class Product {
	
	
	private int ProdID;
	
	private String ProdName;
	
	private String ProdShortDesc;
	
	private String ProdLongDesc;
	
	private double MrpPrice;
	
	private double OfferPrice;
	
	private double CardHolderPrice;
	
	private int PointsRedeem;
	
	private String Imgpath;
	
	private int InventoryQuantity;
	
	private int catmasterID;
	
	private List<Config_details> config_details;
	
	private List<Invoice_details> InvoiceDtList;

	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="ProdID")
	public List<Config_details> getConfig_details() {
		return config_details;
	}

	public void setConfig_details(List<Config_details> config_details) {
		this.config_details = config_details;
	}
	

	public int getCatmasterID() {
		return catmasterID;
	}

	public void setCatmasterID(int catmasterID) {
		this.catmasterID = catmasterID;
	}

	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	@Column(name = "Prod_ID")
	public int getProdID() {
		return ProdID;
	}

	public void setProdID(int prodID) {
		ProdID = prodID;
	}

	@Column(nullable = false)
	public String getProdName() {
		return ProdName;
	}

	public void setProdName(String prodName) {
		ProdName = prodName;
	}

	@Column(nullable = false)
	public String getProdShortDesc() {
		return ProdShortDesc;
	}

	public void setProdShortDesc(String prodShortDesc) {
		ProdShortDesc = prodShortDesc;
	}

	@Column(nullable = false)
	public String getProdLongDesc() {
		return ProdLongDesc;
	}

	public void setProdLongDesc(String prodLongDesc) {
		ProdLongDesc = prodLongDesc;
	}

	@Column(nullable = false)
	public double getMrpPrice() {
		return MrpPrice;
	}

	public void setMrpPrice(double mrpPrice) {
		MrpPrice = mrpPrice;
	}

	public double getOfferPrice() {
		return OfferPrice;
	}

	public void setOfferPrice(double offerPrice) {
		OfferPrice = offerPrice;
	}

	@Column(nullable=false)
	public double getCardHolderPrice() {
		return CardHolderPrice;
	}

	public void setCardHolderPrice(double cardHolderPrice) {
		CardHolderPrice = cardHolderPrice;
	}

	@Column(nullable=false)
	public int getPointsRedeem() {
		return PointsRedeem;
	}

	public void setPointsRedeem(int pointsRedeem) {
		PointsRedeem = pointsRedeem;
	}


	public String getImgpath() {
		return Imgpath;
	}

	public void setImgpath(String imgpath) {
		Imgpath = imgpath;
	}

	@Column(nullable=false)
	public int getInventoryQuantity() {
		return InventoryQuantity;
	}

	public void setInventoryQuantity(int inventoryQuantity) {
		InventoryQuantity = inventoryQuantity;
	}

	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="ProdID")
	public List<Invoice_details> getInvoiceDtList() {
		return InvoiceDtList;
	}
	public void setInvoiceDtList(List<Invoice_details> invoiceDtList) {
		InvoiceDtList = invoiceDtList;
	}
	
}
