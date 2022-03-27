package week1.day2;

public class Calculator {
	
	public int getAdd(int a ,int b) {
		// TODO Auto-generated method stub
		
		return a+b;

	}
	
	public double getSub(double a,double b) {
		// TODO Auto-generated method stub
        return a-b;
	}
	
	public double getMul(double a , double b) {
		// TODO Auto-generated method stub
        return a*b;
	}
	
	public int getDiv(int a , int b) {
		// TODO Auto-generated method stub
		return a/b;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Calculator calculator = new  Calculator();
            System.out.println(calculator.getAdd(5, 10));
            System.out.println(calculator.getSub(5, 10));
            System.out.println(calculator.getMul(5, 10));
            System.out.println(calculator.getDiv(5, 10));
	}

}
