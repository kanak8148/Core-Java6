package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormate2 {
	public static void main(String[] args) throws ParseException {
		
		Date d = new Date ();
		
		
		//System.out.println(d);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		System.out.println(sdf.format(d));//Date To string
		
		String str = "2025-2-20";
		
		System.out.println(sdf.parse(str));
		
		
		
		
	}

}
