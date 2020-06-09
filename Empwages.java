	public class Empwages {

		public static void main(String[]args){

		int IS_FULL_TIME=1;
	
		double empCheck = Math.floor(Math.random()*10) % 2;
		if (empCheck == IS_FULL_TIME ){ 
			int EMP_RATE_PER_HR=20;
			int empHrs=8;
			double salary = (EMP_RATE_PER_HR*empHrs);
			System.out.print(salary);
		}else{
			int salary=0; 
			System.out.print("absent");
	       }

	     }

	}
