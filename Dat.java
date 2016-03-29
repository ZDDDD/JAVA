import java.util.Date;
// import java.text.SimpleDateFormat;
// import java.text.ParseException;

public class Dat{
	public static void main(String[] args) {
		Date d = new Date();

		
		System.out.println(d);

		Date myBirthDay = new Date(94,0,29);
		System.out.println(myBirthDay);

		System.out.println(myBirthDay instanceof Date);

		Date birthDaySong = new Date(93,6,27);

		boolean result = myBirthDay.before(birthDaySong);
		System.out.println(result);

		int compareResult = birthDaySong.compareTo(myBirthDay);
		System.out.println(compareResult);

		switch(compareResult){

			case -1:
			System.out.println("左边大");
			break;

			case 0:
			System.out.println("相等");
			break;

			case 1:
			System.out.println("右边大");
			break;

			



	}
}

	
