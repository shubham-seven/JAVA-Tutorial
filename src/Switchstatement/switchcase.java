package Switchstatement;

public class switchcase {

	public static void main(String[] args) {
	int	result=numOfDays(2012,2);
	System.out.print(result);

	}
static int numOfDays(int year,int month){
	int totaldays=0;
	switch (month) {
	case 1:
		totaldays=31;
		break;
	case 2:
		if (year%4==0) {
			totaldays=29;
break;
		}
		totaldays=28;
		break;
	case 3:
		totaldays=31;
		break;
	case 4:
		totaldays=30;
		break;
	case 5:
		totaldays=31;
		break;
	case 6:
		totaldays=30;
		break;
	case 7:
		totaldays=31;
		break;
	case 8:
		totaldays=31;
		break;
	case 9:
		totaldays=30;
		break;
	case 10:
		totaldays=31;
		break;
	case 11:
		totaldays=30;
		break;
	case 12:
		totaldays=31;
		break;
		default:
			System.out.print("Invalid month");
	}
	return totaldays;
}
	
}
