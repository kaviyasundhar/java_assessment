package com.assignment;

public class invoice
{
	private String partNumber;
    private String partDescription;
    private int quantity;
    private double unitPrice;

    // para constructor
    public invoice(String partNumber, String partDescription, int quantity, double unitPrice){

      this.partNumber = partNumber; 
      this.partDescription = partDescription;
      this.setQuantity(quantity); 
      
     // this.quantity = quantity;
      
      this.setUnitPrice(unitPrice); 
      
     // this.unitPrice = unitPrice;
    }

	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getPartDescription() {
		return partDescription;
	}

	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		if(quantity > 0) {
		
		this.quantity = quantity;
		}
		else
			this.quantity=0;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		if(unitPrice>0) 
		this.unitPrice = unitPrice;
		else
			this.unitPrice = 0.0;
	}
	
	public double getInvoiceAmount()
	{
		return getQuantity() * getUnitPrice();
	}
	
}
    
