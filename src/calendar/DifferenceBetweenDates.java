/**
 * 
 */
package calendar;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @author Fernando Costa Migliorini
 * @email fercosmig@gmail.com
 * @since Dec 26, 2019
 * @file calendar.DifferenceBetweenDates.java
 */
public class DifferenceBetweenDates {
	private static final float SECONDS_IN_MILLISECONDS = 1000;
	private static final float MINUTES_IN_MILLISECONDS = 60000;
	private static final float HOURS_IN_MILLISECONDS = 3600000;
	private static final float DAYS_IN_MILLISECONDS = 86400000;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Calendar startDate = Calendar.getInstance();
		startDate.set(1998, 5, 26, 6, 45, 0);
		startDate.set(Calendar.MILLISECOND, 0);

		Calendar endDate = Calendar.getInstance();
		//endDate.set(2019, 11, 26, 15, 0, 0);
		//endDate.set(Calendar.MILLISECOND, 0);
		

		NumberFormat nf = NumberFormat.getInstance();
		nf.setMaximumFractionDigits(0);

		String pattern = "EEE, MMM dd, yyyy HH:mm:ss";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		
		System.out.println("Data inicial: " + sdf.format(startDate.getTime()));
		System.out.println("Data Final: "+ sdf.format(endDate.getTime()));
		
		long sd = startDate.getTimeInMillis();
		long ed = endDate.getTimeInMillis();

		long diffInMillis = ed - sd;
		System.out.println("A diferença entre as datas é de " + diffInMillis + " milisegundos.");

		float days = diffInMillis / DAYS_IN_MILLISECONDS;
		float restDays = diffInMillis % DAYS_IN_MILLISECONDS;
		
		float hours = restDays / HOURS_IN_MILLISECONDS;
		float restHours = restDays % HOURS_IN_MILLISECONDS;

		float minutes = restHours / MINUTES_IN_MILLISECONDS;
		float restMinutes = restHours % MINUTES_IN_MILLISECONDS;

		float seconds = restMinutes / SECONDS_IN_MILLISECONDS;
		@SuppressWarnings("unused")
		float restSeconds = restMinutes % SECONDS_IN_MILLISECONDS;

		String msg = "A diferença entre as datas acima é: ";
		msg += nf.format(days) + " dias, ";
		msg += nf.format(hours) + " horas, ";
		msg += nf.format(minutes) + " minutos e ";
		msg += nf.format(seconds) + " segundos.";

		System.out.println(msg);
		
		// float diffInSeconds = diffInMillis / 1000;
		// System.out.println(diffInSeconds);
		// float diffInMinutes = diffInMillis / (60 * 1000);
		// System.out.println(diffInMinutes);
		// float diffInHours = diffInMillis / (60 * 60 * 1000);
		// System.out.println(diffInHours);
		// float diffInDays = diffInMillis / (24 * 60 * 60 * 1000);
		// System.out.println(diffInDays);
		// System.out.println("startDate: " + startDate.getTime());
		// System.out.println("endDate: " + endDate.getTime());
		// System.out.println("Difference in Seconds : " + diffInSeconds);
		// System.out.println("Difference in Minute : " + diffInMinutes);
		// System.out.println("Difference in Hours : " + diffInHours);
		// System.out.println("Difference in Days : " + diffInDays);

	}

}