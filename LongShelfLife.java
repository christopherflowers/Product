package uwstout.cs144.labs.lab09;

/**
 * This class is for a long shelf Perishable.
 * 
 * @author flowersC
 * @version 2016-11-30
 */
public class LongShelfLife extends Perishable {

	/**
	 * This creates a perishable whose shelf life is 720 days.
	 * 
	 * @param nName
	 *            the name of the product
	 * @param nPrice
	 *            the price of the product
	 */
	public LongShelfLife(String nName, double nPrice) {
		super(nName, nPrice, 720);
	}
	
}
