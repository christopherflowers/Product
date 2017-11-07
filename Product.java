package uwstout.cs144.labs.lab09;

/**
 * This class creates a product with a name.
 * 
 * @author flowersC
 * @version 2016-11-30
 *
 */
abstract public class Product {

	/**
	 * This is the name of the product.
	 */
	protected String name;

	/**
	 * This getter gets the name of the method.
	 * 
	 * @return the name of the product
	 */
	public String getName() {
		return name;
	}

	/**
	 * This constructor makes a new product with the given name.
	 * 
	 * @param nName
	 *            the name of the product
	 */
	public Product(String nName) {
		name = nName;
	}

	/**
	 * This method gets the price of the product.
	 * 
	 * @return the price
	 */
	abstract public double getPrice();

}
