package week1.day2.assignments;

public class EmployeeDeets {
	public void printAddress() {
		System.out.println("Chennai");
	}
		public String getAddress()
		{
			return "Chennai";
		}
		public void getEmployeeDeets(String ename, int eID) {
			System.out.println(ename);
			System.out.println(eID);
		}
		
	public static void main(String[] args) {
		EmployeeDeets ed = new EmployeeDeets();
		String address = ed.getAddress();
		System.out.println(address);
		ed.getEmployeeDeets("Shiva", 0);
		ed.getEmployeeDeets("1010", 0);
	}

}