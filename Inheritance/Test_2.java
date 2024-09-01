package Inheritance;
abstract class emp{
		String name;
		int empid;
	
	public emp(String s,int e) {
		this.name=s;
		this.empid=e;
		
	}
	abstract double calculatesal();
	public String  empdetails() {
		return "name: "+name+" "+"empid: "+empid;
	}
}
class salary extends emp{
	double annualsal;
	public salary(String s, int e,double annualsal) {
		super(s, e);
		this.annualsal=annualsal;
		
	}
	@Override
	double calculatesal() {
		return annualsal/12;
	}
	
}
class hourlysal extends emp{
	
	int no_of_hours;
	double amount_hour;
	public hourlysal(String s, int e,int no_of_hours,double amount_hour) {
		super(s, e);
		this.amount_hour=amount_hour;
		this.no_of_hours=no_of_hours;
		
	}
	@Override
	double calculatesal() {
		
		return amount_hour*no_of_hours;
	}
}
public class Test_2 {

	public static void main(String[] args) {
			salary s=new salary("pranay", 101, 600000);
			System.out.println(s.empdetails());
			System.out.println("salary: "+s.calculatesal());
			hourlysal hs=new hourlysal("Rahul", 105,5 ,5000);
			System.out.println(hs.empdetails());
			System.out.println("salary: "+hs.calculatesal());
	}

}
