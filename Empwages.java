	import java.util.ArrayList;
	public class Empwages {
		public static int getWorkingHrs( int empCheck ){
			int empHrs=0 ;
			switch( empCheck) {					
				case 1 : 			
				empHrs=8;
				break;

				case 2 :
				empHrs=4;
				break;

				default :
				empHrs=0;
			}

			return empHrs;

		}

		public static void main(String[]args){

			int IS_FULL_TIME=1;
			int IS_PART_TIME=2;
			int EMP_RATE_PER_HR=10;
			int Num_Working_Day=20;

			int empHrs=0;
			int numberofworkingday=0;
			int totalsalary=0;
			int myList;
			ArrayList<Integer> myNumbers = new ArrayList<Integer>();
			while(numberofworkingday<=Num_Working_Day) {
				double empCheck = Math.floor(Math.random()*10) % 3;
				int result = getWorkingHrs((int)empCheck);	
				myNumbers.add((int)(result * EMP_RATE_PER_HR ));
				numberofworkingday++;
			}
			for (int i : myNumbers) {
				System.out.println(i);
			
			}
			
		}

	}
