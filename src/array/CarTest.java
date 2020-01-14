/**
 * 
 */
package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Fernando Costa Migliorini
 * @email fercosmig@gmail.com
 * @since Jan 9, 2020
 * @file array.CarTest.java
 */
public class CarTest {

	/**
	 * 
	 */
	public CarTest() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<Car> cars = new ArrayList<Car>();
		Car car;
		
		car = new Car();
		car.setBrand("Volkswagen");
		car.setModel("Saveiro");
		cars.add(car);
		
		car = new Car();
		car.setBrand("Fiat");
		car.setModel("Strada");
		cars.add(car);

		car = new Car();
		car.setBrand("Chevrolet");
		car.setModel("Montana");
		cars.add(car);

		car = new Car();
		car.setBrand("Ford");
		car.setModel("Courier");
		cars.add(car);

		car = new Car();
		car.setBrand("Peugeot");
		car.setModel("Hoggar");
		cars.add(car);

		for(Car c : cars) {
			System.out.println(c.getBrand() + " - " + c.getModel());
		}
	}

}
