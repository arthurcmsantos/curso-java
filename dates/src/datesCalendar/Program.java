package datesCalendar;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date y = Date.from(Instant.parse("2021-11-20T18:36:20Z"));
		
		System.out.println(sdf.format(y));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(y);
		Integer Hours = cal.get(Calendar.HOUR);
		
		
		
		
		System.out.println("Hours: " + Hours);
	}

}
