package kr.ac.kookmin.embedded.sales; 
  
 public class DiscountSale extends Sale { 
 	private double	discount;	// A percent of the price. Cannot be negative. 
 								 
 	public DiscountSale() { 
 		super("No_Name", 0); 
 		this.discount = 0; 
 		/** 援ы쁽 �븯�떆�삤 **/  
 	} 
 	 
 	/** 
 	 * Precondition: theName is a nonempty string; thePrice is nonnegative; 
 	 * theDiscount is expressed as a percent of the price and is nonnegative. 
 	 */ 
 	public DiscountSale(String theName, double thePrice, double theDiscount) { 
 		super(theName, thePrice); 
 		this.discount = theDiscount; 
 		 
 		/** 援ы쁽 �븯�떆�삤 **/  
 	} 
 	 
 	public DiscountSale(DiscountSale originalObject) { 
 		this.discount = originalObject.discount; 
 		/** 援ы쁽 �븯�떆�삤 **/  
	} 
 	 
 	public static void announcement() { 
 		System.out.println("This is the DiscountSale class."); 
 	} 
 	 
 	public double bill() { 
 		double price = getPrice(); 
 		return price - price * (this.discount / 100); 
 		 
 		 
 		/** 援ы쁽 �븯�떆�삤 **/  
 	} 
 	 
 	public double getDiscount() { 
 		 
 		return this.discount; 
 		/** 援ы쁽 �븯�떆�삤 **/  
 	} 
 	 
 	/** 
 	 * Precondition: Discount is nonnegative. 
 	 */ 
 	public void setDiscount(double newDiscount) { 
 		 
 		this.discount = newDiscount; 
 		/** 援ы쁽 �븯�떆�삤 **/  
 	} 
 	 
 	public String toString() { 
 		return (getName() + " Price = $" + getPrice() + " Discount = " + discount + "%\n" + "   Total cost = $" + bill()); 
 	} 
 	 
 	public boolean equals(Object otherObject) { 
 		if (otherObject == null) 
 			return false; 
 		else if (getClass() != otherObject.getClass()) 
 			return false; 
 		else { 
 			Sale otherSale = (Sale) otherObject; 
 			 
 			return super.getName().equals(otherSale.getName()) && (this.bill() == ((DiscountSale)otherObject).bill()); 
 			//return (name.equals(otherSale.name) && (price == otherSale.price)); 
 		} 
 		/** 援ы쁽 �븯�떆�삤 **/  
 	} 
 	 
 	 
 	public DiscountSale clone() { 
 		return new DiscountSale(this); 
 		/** 援ы쁽 �븯�떆�삤....  �엫�떆�깮�꽦�옄 �궗�슜 **/  
 	} 
 } 

