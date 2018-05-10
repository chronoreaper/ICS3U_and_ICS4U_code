import java.util.Scanner;

/**
 * Christopher Duong
 *Declining stats
 */
public class U5A2_declining {

	public static void main(String[] args) {
		//variable decoration
		int year=0,again=1;
		//array decoration
		double dec[]= new double[31];
		//user input
		Scanner ui=new Scanner(System.in);
		//sets year limit in between 1985-2025
		for (int i=0; i<=30; i++)
			//subtract 0.45% for each year after 1985
			dec[i]=(double) (30-(i*0.45));
		System.out.println("Attendance for going to chuch has been declining since 1985. \n Type any year from 1985 to 2025 to see the percent of which Canadinas attend weekly church.");
		while (again==1){
			year=0;
			year=Integer.parseInt(ui.next());
			System.out.println("In the year "+year+" the percent of Canadians going to church every week is "+dec[year-1985]+"%.");
			again=0;
			System.out.println("Press 1 to choose another year");
			again=Integer.parseInt(ui.next());
		}
	}//end main
}//end class
