package uwstout.cs144.labs.lab09;

/**
 * This class tests Product's methods through its child classes.
 * 
 * @author flowersC
 * @version 2016-11-30
 */
public class TestingProduct {

	/**
	 * This is used to test Product's methods through its child classes.
	 * 
	 * @param args
	 *            command line parameters
	 */
	public static void main(String[] args) {

		StoreDecoration dec1 = new StoreDecoration("Snow Elf", "Christmas");
		System.out.println(dec1.getName());
		System.out.println(dec1.getHoliday());
		System.out.println(dec1.getPrice());

		System.out.println("");

		Perishable per1 = new Perishable("Beans", 2.50, 10);
		System.out.println(per1.getName());
		System.out.println(per1.getPrice());
		System.out.println(per1.getShelfLife());
		System.out.println(per1.getDiscountedPrice(11));
		System.out.println(per1.getDiscountedPrice(9));

		ShortShelfLife ssl1 = new ShortShelfLife("Chips", 5.00, 4);
		System.out.println(ssl1.getName());
		System.out.println(ssl1.getPrice());
		System.out.println(ssl1.getShelfLife());
		System.out.println(ssl1.isSellable(5));
		System.out.println(ssl1.isSellable(6));
		System.out.println(ssl1.getDiscountedPrice(5));

		System.out.println("");

		LongShelfLife lsf1 = new LongShelfLife("Can of Mush", 6.00);
		System.out.println(lsf1.getName());
		System.out.println(lsf1.getPrice());
		System.out.println(lsf1.getShelfLife());

	}

}
