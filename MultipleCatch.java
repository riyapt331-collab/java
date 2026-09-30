class MultipleCatch{
	public static void main(String args[]){
	try{
		int a[] ={10,20,30};
		int x=10/0;
		System.out.println(a[5]);
	}
	catch(ArithmeticException e)
	{
	System.out.println("ArithmeticException occurred");
	}
	catch 
	(ArrayIndexOutOfBoundsException e){
		System.out.println("ArrayIndexException occurred");
	}
	}
}