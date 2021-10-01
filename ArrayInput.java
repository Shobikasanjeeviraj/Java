import java.util.Scanner;
class ArrayInput 
{
	public static void main(String[] args) 
	{
	  Scanner scan=new Scanner(System.in);  
      System.out.print("Enter the number of elements you want to store: ");  

      int n=scan.nextInt();  
      if((n<=0)||(n>100)){
		   System.out.println("Enter the valid input");
	  }
	  else{
      int[] array = new int[10];  
      System.out.println("Enter the elements of the array: ");  
      for(int i=0; i<n; i++)  
      { 
       array[i]=scan.nextInt();  
       }  
        System.out.println("Array elements are: ");  

      for (int i=0; i<n; i++)   
     {  
      System.out.print(array[i]+ " ");  
      }  
	}
	}
}
