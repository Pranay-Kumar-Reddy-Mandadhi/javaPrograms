package day1;

 class D {

	public static void m3() {
		System.out.println("m3 starts ");
		C.main(null);
		System.out.println("m3 ends ");

	}
		public static void main (String[]args) {
		System.out.println("execution of m2 starts ");
		D.m3();
		System.out.println("execution of m2 ends" );
	}
}
