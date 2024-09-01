package Day_3_variables_types;
/*non static variables are declared inside the class and outside 
 * of the main method without a static keyword ..
 * to use non static variable we have to first create the objecct
 * with new keyword 
 * in non static variable when ever object is created there the 
 * memory allocation is done...
 *  if we  have 2 objects created  the memory allocation takes place 
 *  two times ..
 *  but in static only once the memory allocation is done for 
 *  n number of objects created .
 */
class C {
	int i;
	int j;
	static int k;
	

	public static void main(String[] args) {
		System.out.println(C.k);
		C obj1=new C();
		C obj2=new C();
		obj1.i=20;
		obj2.i=40;
		System.out.println(obj1.i);
		System.out.println(obj2.i);
		System.out.println(obj1.k);
		obj1.k=20;
		System.out.println(obj1.k);
		

	}

}
