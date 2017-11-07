package uwstout.cs144.labs.lab09;

/**
 * This class creates a Perishable product.
 * 
 * @author flowersC
 * @version 2016-11-30
 */
public class Perishable extends Product {

	/**
	 * This is the shelf life of the product.
	 */
	protected int shelfLife;

	/**
	 * This is the price of the product.
	 */
	protected double price;

	/**
	 * This constructor creates a new Perishable.
	 * 
	 * @param nName
	 *            the name of the product
	 * @param nPrice
	 *            the price of the product
	 * @param days
	 *            the shelf life of the product
	 */
	public Perishable(String nName, double nPrice, int days) {
		super(nName);
		price = nPrice;
		shelfLife = days;
	}

	/**
	 * This getter gets the price of the product.
	 * 
	 * @return the price of the product
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * This getter gets the shelf life of the product.
	 * 
	 * @return the shelf life of the product
	 */
	public int getShelfLife() {
		return shelfLife;
	}

	/**
	 * This gets a discounted price of the product.
	 * 
	 * @param days
	 *            the shelf life
	 * @return the price of the product, or the discounted price
	 */
	public double getDiscountedPrice(int days) {
		if (days > shelfLife) {
			return price - (price * 0.1);
		}
		//I just changed this from price to 0
		return price; 
	}

}
