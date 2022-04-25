package class3;
import java.util.Scanner;


	 class Code1 {
		 void operations() {
		        Scanner sc= new Scanner(System.in);
		        System.out.println("enter the num-1");
		        int num1 = sc.nextInt();
		        System.out.println("enter the num-1");
		        int num2 = sc.nextInt();
		        
		        System.out.println("Please select the opearation to be performed\n "
		                + "1. Addition\n"
		                + "2. subtraction\n"
		                + "3. multiplication\n"
		                + "4. division\n"
		                + "5. exit");
		        int n = sc.nextInt();
		        
		        if(n==1) {
		            int addition = num1+num2;
		            System.out.println("The addition result is: "+addition);
		        }
		        else if(n==2) {
		            int subtraction = num1-num2;
		            System.out.println("The subtraction result is: "+subtraction);
		           
		        }
		        else if (n==3) {
		        	int multiply=num1*num2;
		        		System.out.println("The multiplication result is: "+multiply);
		        	
		        }
		        else if(n==4) {
		        	int div=num1/num2;
		        	System.out.println("The division result is: "+div);
		        	
		        	}
		        
		        else  {
		            System.exit(0);
		        }
		    }
	  
	}
	 



	 public class Calculator2 {
		  public static void main(String[] args) {
		        
		      Code1 c = new Code1();
		        for(; ;) //infinite loop
		        {
		            c.operations();
		        }
		        
		    }

		    
	}