/**
 * 
 */
package accenture;

/**
 * @author Fernando Costa Migliorini
 * @email fercosmig@gmail.com
 * @since Dec 23, 2019
 * @file accenture.Tests.java
 */
public class Tests {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mammal dog = new Dog();
		Mammal cat = new Cat();

		Dog d = new Dog();
		Cat c = new Cat();

		dog.speak();
		cat.speak();
		d.speak();
		c.speak();
	}

}
