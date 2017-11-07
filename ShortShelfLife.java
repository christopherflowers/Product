package uwstout.cs144.labs.lab09;

/**
 * This class is for short shelf life Perishables.
 * 
 * @author flowersC
 * @version 2016-11-30
 */
public class ShortShelfLife extends Perishable {

	/**
	 * This constructs a short shelf life product.
	 * 
	 * @param nName
	 *            the name of the product
	 * @param nPrice
	 *            the price of the product
	 * @param days
	 *            the shelf life of the product
	 */
	public ShortShelfLife(String nName, double nPrice, int days) {
		super(nName, nPrice, days);
	}

	/**
	 * This method determines if the product is able to be sold.
	 * 
	 * @param days
	 *            the shelf life of the product
	 * @return true if it can be sold, false if not
	 */
	public boolean isSellable(int days) {
		// I changed this from <= to <
		return days < (1.25 * shelfLife);

	}

	/**
	 * This method determines the discounted price of the product.
	 * 
	 * @param days
	 *            the shelf life of the product
	 * @return the discounted price of the product
	 */
	public double getDiscountedPrice(int days) {
		if (isSellable(days)) {
			return super.getDiscountedPrice(days);
		}
		return 0;
	}

}
