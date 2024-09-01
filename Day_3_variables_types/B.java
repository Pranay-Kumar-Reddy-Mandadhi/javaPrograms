package Day_3_variables_types;
/*static variables are declared inside the class and outside the 
 * main method with the static keyword.
 */
 class B {
	 int i;//non static variable
	 static int j;//static variable
	public static void main(String[] args) {
	//static variable declaration
		System.out.println(j);//directly can be called since no local variables present
		int j=50;
		System.out.println(j);//here we have a local variable  so local variable is printed as output
		System.out.println(B.j);//by using class name we can call the static member delared inside the class and outside the main  method 
		B.j=100;//the static variable insitiaized in the classs gets updated to 100
		System.out.println(B.j);
	}

}
