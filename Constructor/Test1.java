package Constructor;
class A{
	int price;
	String name;
A(int p,String n){
	price=p;
	name=n;
	
}

 void  display() {
	 System.out.println(price);
	 System.out.println(name);
 }
}
 class Test1 {

	public static void main(String[] args) {
		A a1=new A(20000, "realme");
		A a2=new A(60000,"i-phone");
		a1.display();
		a2.display();
	
	}
}
