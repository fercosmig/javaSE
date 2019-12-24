/**
 * 
 */
package calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @author Fernando Costa Migliorini
 * @email fercosmig@gmail.com
 * @since Dec 23, 2019
 * @file calendar.CalendarTests.java
 */
public class CalendarTests {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar c = Calendar.getInstance();

		// Monday, December 23, 2019
		String pattern = "EEEEE, MMMMM dd, yyyy";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		System.out.println(":: " + sdf.format(c.getTime()));

		// Monday, December 23, 2019 14:23:52
		pattern = "EEEEE, MMMMM dd, yyyy HH:mm:ss";
		sdf = new SimpleDateFormat(pattern);
		System.out.println(":: " + sdf.format(c.getTime()));

		// Mon, Dec 23, 2019 14:23:52
		pattern = "EEE, MMM dd, yyyy HH:mm:ss";
		sdf = new SimpleDateFormat(pattern);
		System.out.println(":: " + sdf.format(c.getTime()));

		// Mon, Dec 23, 19 02:23:52 PM
		pattern = "EEE, MMM dd, yy hh:mm:ss a";
		sdf = new SimpleDateFormat(pattern);
		System.out.println(":: " + sdf.format(c.getTime()));

		// 2019-12-23
		pattern = "yyyy-MM-dd";
		sdf = new SimpleDateFormat(pattern);
		System.out.println(":: " + sdf.format(c.getTime()));

		// Tue Jan 07 14:23:52 BRT 2020
		c.set(2019, 12, 7);
		System.out.println(c.getTime());

		// Thu Sep 19 16:36:25 BRT 2019
		c.set(Calendar.YEAR, 1977);
		c.set(Calendar.MONTH, 8);
		c.set(Calendar.DAY_OF_MONTH, 19);
		c.set(Calendar.HOUR_OF_DAY, 16);
		c.set(Calendar.MINUTE, 36);
		c.set(Calendar.SECOND, 25);
		System.out.println(c.getTime());
	}

}
