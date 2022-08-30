package in.co.calender;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class AgeCalculate {
public static void main(String[] args) throws ParseException {
	SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
	Date d=sdf.parse("18/04/1997");
	
	
	 
	Calendar cal=Calendar.getInstance();
	cal.setTime(d);
	Calendar cal1=Calendar.getInstance();
	cal1.setTime(new Date());
	int currentage=cal1.get(Calendar.YEAR)-cal.get(Calendar.YEAR);
	System.out.println(currentage);
	
	
	
			
}

}
