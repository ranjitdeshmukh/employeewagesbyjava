	public class Empwages {

		public static void main(String[]args){

		int IS_FULL_TIME=1;
		int IS_PART_TIME=2;
		int EMP_RATE_PER_HR=20;


		int empHrs=0;
		int numberofworkingday=20;
		double totalsalary=0;

		for (int day=1; day<=numberofworkingday ; day++) {
			
		
		double empCheck = Math.floor(Math.random()*10) % 3;
		
		switch((int) empCheck) {
		
			case 1 : 			
			      empHrs=8;
			      break;
		    case 2 :
		    	  empHrs=4;
		    	  break;
		   default :
		   		empHrs=0;
        }
	        double salary = empHrs * EMP_RATE_PER_HR  ;
	        totalsalary = salary + totalsalary;
	        
	  	}


	  }

	}
