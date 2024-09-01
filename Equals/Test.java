package Equals;

class emp{
	String name;
	int emp_id;
	long mobilenum;
	public emp(String name, int emp_id, long mobilenum) {
		this.name = name;
		this.emp_id = emp_id;
		this.mobilenum = mobilenum;
	}
	@Override
	public String toString() {
		return "emp [name=" + name + ", emp_id=" + emp_id + ", mobilenum=" + mobilenum + "]";
	}
	@Override
	public boolean equals(Object o) {
		emp e=(emp)o;
		return this.name.equals(e.name)&& this.emp_id==e.emp_id&&this.mobilenum==e.mobilenum;
	}
}
public class Test {

	public static void main(String[] args) {
		emp e1 =new emp("pranay ", 101, 9985464825l);
		emp e2=new emp("pranay", 101, 9985464825l);
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e1.equals(e2));

	}

}
