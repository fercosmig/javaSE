/**
 * 
 */
package properties;

/**
 * @author Fernando Costa Migliorini
 * @email fercosmig@gmail.com
 * @since Dec 23, 2019
 * @file properties.TestMessages.java
 */
public class TestMessages {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg = Messages.getMessage("pt404");
		System.out.println(msg);

		msg = Messages.getMessage("en404");
		System.out.println(msg);

		msg = Messages.getMessage("pt500");
		System.out.println(msg);

		msg = Messages.getMessage("en500");
		System.out.println(msg);

		msg = Messages.getMessage("ptSalutation");
		System.out.println(msg);

		msg = Messages.getMessage("enSalutation");
		System.out.println(msg);
		
	}

}
