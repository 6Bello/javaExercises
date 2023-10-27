package università;

public class takeFromString {
	
	public int takeYearFromString(String data){
		int year = 0;
		for(int i=1; i<5; i++) {
			if(data.substring(i, i+1).equals("/")){
				year = Integer.parseInt(data.substring(0, i));
				break;
			}
		}
		return year;
	}
	
	public int takeMonthFromString(String data){
		int month = 0;
		int yearPassed = -1;
		for(int i=2; i<8; i++) {
			if(data.substring(i, i+1).equals("/")){
				if(yearPassed==-1) yearPassed= i;
				else {
					month = Integer.parseInt(data.substring(yearPassed + 1, i));
					break;
				}
			}
		}
		return month;
	}
	
	public int takeDayFromString(String data){
		int day = 0;
		for(int i=data.length()-2; i>3; i--) {
			if(data.substring(i, i+1).equals("/")){
				day = Integer.parseInt(data.substring(i+1, data.length()));
				break;
			}
		}
		return day;
	}
}
