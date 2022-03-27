package week1.day2;

public class ArmStrongNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int input = 153,calculated = 0,remainder,original;
           original=input;
           while(input > 0)
           {
        	   remainder=input%10;
        	   input/=10;
        	   calculated=calculated+(remainder*remainder*remainder);
        	   	   
           }
           
           if(calculated==original)
           {
        	   System.out.println("Armstrong no");
           }
           
           else
           {
        	   System.out.println("Not an Armstrong no");
           }
	}

}
