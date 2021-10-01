class SwapTwoNumbers 
{
	public static void Swap(){
		 int x = 12, y = 15;
 
        System.out.println("Before Swap");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("\n");
        x = x + y; 
        y = x - y; 
        x = x - y; 
 
        System.out.println("After swap");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
	}


	public static void  Series(){
	
    int n = 10, firstTerm = 0, secondTerm = 1;
     System.out.print("FionacciSeries :");
     System.out.println("\n");
    for (int i = 1; i <= n; i++) {
      System.out.print(firstTerm + ", ");
      
      
      int nextTerm = firstTerm + secondTerm;
      firstTerm = secondTerm;
      secondTerm = nextTerm;
	}
}
	public static void main(String[] args) 
	{
		Swap();
       Series();
	}
}
