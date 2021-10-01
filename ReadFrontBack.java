import java.util.Scanner;
class ReadFrontBack 
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

      int[] array = new int[6];  
      System.out.println("Enter the elements of the array: ");  
      for(int i=0; i<n; i++)  
      { 
       array[i]=scan.nextInt();  
       } 
     
	 boolean read=true;
	 int i,j=5;
	 for(i=0;i<n/2;i++)
		  {
		 if(array[i]!=array[j])
			  {
			 read=false;
			break;
      }
          else{
			  j--;
			
		  }
		  }

		  if(read==true){
			   System.out.println("Array is same from Front and back");
		  }
		  else
		  {
			    System.out.println("Array is not same from Front and back");
		  }
 
  }
	}
}
