import java.util.Scanner;
class checkPosNegOddEve 
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
      int[] array = new int[20];  
      System.out.println("Enter the elements of the array: ");  
      for(int i=0; i<n; i++)  
      { 
       array[i]=scan.nextInt();  
       }  

     int positive=0;
	 int negative=0;
	 int even=0, odd=0;
	 int zero=0;

	 for(int i=0;i<n;i++)
		  {
            if (array[i]>0)
            {
				positive++;
            } 

			else if (array[i]<0)
			{
				negative++;
			}
			else if (array[i]==0)
			{
				zero++;
			}

			
		   if(array[i]%2==0)
			    {
				even++;
			    }
			 else 
			{
				odd++;
			}
		  
			
	    }

      System.out.println("The Positive Numbers are : "+positive);
	  System.out.println("The Negative Numbers are : "+negative);
	  System.out.println("The Even Numbers are : "+even);
	  System.out.println("The Odd Numbers are : "+odd);
      System.out.println("The Zeroes are : "+zero);



	  }
	}
}
