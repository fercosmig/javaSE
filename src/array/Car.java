/**
 * 
 */
package array;

/**
 * @author Fernando Costa Migliorini
 * @email fercosmig@gmail.com
 * @since Jan 9, 2020
 * @file array.Car.java
 */
public class Car {
	
	/**
	 * Attributes
	 */
	
	private String brand;
	private String model;

	/**
	 * Constructors
	 */
	
	public Car() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param brand
	 * @param model
	 */
	public Car(String brand, String model) {
		super();
		this.brand = brand;
		this.model = model;
	}

	/**
	 * Getters and Setters
	 */
	
	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * @param brand the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

}
