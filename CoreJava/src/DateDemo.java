import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		// Current Date and Time
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
		SimpleDateFormat sdf1 = new SimpleDateFormat("M/d/yyyy hh:mm:ss");
		System.out.println(d.toString());
		System.out.println(sdf.format(d));
		System.out.println(sdf1.format(d));
	}

}
