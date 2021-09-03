package CoreJavaBasics;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Datedemo {

	public static void main(String[] args) {
		// there is a date class in java util package 
		Date a = new Date();
		System.out.println(a);
		System.out.println(a.toString());		// output- Mon Aug 31 15:07:31 IST 2020
		// there is one of class SimpleDAteFormat to format into required date format and you need to send the date format(which you want) as parameter
		SimpleDateFormat b = new SimpleDateFormat("MM/dd/yyyy");   // this is just for formating still we need to depend on date class to retrieve the date
		// now we need to combine Date and simpledateformat 
		System.out.println(b.format(a));     // send date class object to format  output : 08/31/2020
		SimpleDateFormat sd = new SimpleDateFormat("MM/dd/yyyy hh:mm");
		System.out.println(sd.format(a));   // output : 08/31/2020 03:24
	}

}
