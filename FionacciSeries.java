class FionacciSeries 
{
void  Series(){
	
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
		FionacciSeries fs=new FionacciSeries();
		fs.Series();
	}
}
