package Calltothis;
class rect{
	int length;
	int breadth;
	int height;
	rect(int l,int b,int h) {
		length=l;
		breadth=b;
		height=h;
	}
	rect(int a){
		this(a,a,a);
	}
	void display() {
		System.out.println("length= "+length+" breadth= "+breadth+" height= "+height);
	}
}
public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rect r=new rect(10,20,30);
		r.display();
		rect r1=new rect(10);
		r1.display();
		
	}

}
