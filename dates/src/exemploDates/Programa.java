package exemploDates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Programa {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Date x1 = new Date();
		
		Date y1 = sdf1.parse("17/02/1997");
		Date y2 = sdf2.parse("20/11/2021 18:18:18");
		Date y3 = Date.from(Instant.parse("2021-11-20T18:36:20Z"));
		
		System.out.println(y1);
		System.out.println(y2);
		
		System.out.println(" OU ");
		
		System.out.println("y1: " + sdf2.format(y2));
		System.out.println("y2: " + sdf2.format(y1));
		System.out.println("y3: " + sdf2.format(y3));
		
		System.out.println(" SDF3 ");
		System.out.println("y3: " + sdf3.format(y3));

		
		System.out.println("Hora atual: ");
		System.out.println(x1);
		System.out.println("x1: " + sdf2.format(x1));
		
	}

}
