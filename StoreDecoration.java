package uwstout.cs144.labs.lab09;

/**
 * This class defines a store decoration that cannot be bought.
 * 
 * @author flowersC
 * @version 2016-11-30
 *
 */
public class StoreDecoration extends Product {

	/**
	 * The holiday the decoration relates to.
	 */
	private String holiday;

	/**
	 * This constructor creates a new StoreDecoration.
	 * 
	 * @param nName
	 *            the name of the product
	 * @param nHoliday
	 *            the season it relates to
	 */
	public StoreDecoration(String nName, String nHoliday) {
		super(nName);
		holiday = nHoliday;
	}

	/**
	 * This getter gets the price of the decoration.
	 * 
	 * @return 0, because you can't buy the decorations
	 */
	public double getPrice() {
		return 0;
	}

	/**
	 * This getter gets the season the product relates to.
	 * 
	 * @return the season the product relates to
	 */
	public String getHoliday() {
		return holiday;
	}

	/**
	 * This getter gets the name of the product.
	 * 
	 * @return the name for the product plus an asterisk
	 */
	public String getName() {
		return name + "*";
	}

}
