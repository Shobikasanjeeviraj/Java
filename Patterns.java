class Patterns 
{
	public static void main(String[] args) 
	{
		Pattern1();
		Pattern2();
		Pattern3();
		Pattern4();
		Pattern5();
		Pattern6();
		Pattern7();
		Pattern8();
		Pattern9();
		Pattern10();
	
		
	}


   public static void Pattern1(){
	     System.out.println("Pattern 1 :");
		  System.out.println();
        for (int i = 1; i <= 5; i++)
        { 
			int k=i;
            for (int j = 1; j <= i; j++)
            {
                System.out.print(k + " ");
				k=k+(5-j);
            }
            System.out.println();
        }
 System.out.println("------------------------------------------------");
   }

   public static void Pattern2(){
	     System.out.println("Pattern 2 :");
		  System.out.println();
	  for (int i = 5; i >= 1; i--)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
      System.out.println("------------------------------------------------");
   }

public static void Pattern3(){
	     System.out.println("Pattern 3 :");
		  System.out.println();
	  for (int i = 1; i <=5; i++)
        {
            for (int j = i; j <= 5; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
       System.out.println("------------------------------------------------");
   }

 public static void Pattern4(){
	     System.out.println("Pattern 4 :");
		  System.out.println();

        for (int i = 1; i <= 5; i++)
        {
            for (int j = 5; j >= i; j--)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
		   System.out.println("------------------------------------------------");
 }

 
 public static void Pattern5(){
	     System.out.println("Pattern 5 :");
		  System.out.println();
        for (int i = 5; i >=1; i--)
        { 
            for (int j = i; j <= 5; j++)
            {
                System.out.print(j + " ");
				
            }
            System.out.println();
        }
  System.out.println("------------------------------------------------");
   }


   public static void Pattern6(){
	     System.out.println("Pattern 6 :");
		  System.out.println();
        for (int i = 1; i<=5; i++)
        { 
            for (int j = i; j>=1; j--)
            {
                System.out.print(j + " ");
				
            }
            System.out.println();
        }
 System.out.println("------------------------------------------------");
   }

   public static void Pattern7(){
	     System.out.println("Pattern 7 :");
		  System.out.println();
        for (int i = 5; i >=1; i--)
        { 
            for (int j = 5; j >= i; j--)
            {
                System.out.print(j + " ");
				
            }
            System.out.println();
        }
   System.out.println("------------------------------------------------");
   }


public static void Pattern8(){
	     System.out.println("Pattern 8 :");
		  System.out.println();

        for (int i = 1; i <= 5; i++)
        {
            for (int j = 5; j >= i; j--)
            {
                System.out.print(i + " ");
            }
            System.out.println();
        }
		   System.out.println("------------------------------------------------");
 }


public static void Pattern9(){
	     System.out.println("Pattern 9 :");
		  System.out.println();
        for (int i = 1; i <= 4; i++)
        {  
            for (int j = i; j >=1; j--)
            {
				 System.out.print(j%2 + " ");
				}
            System.out.println();  
}
  System.out.println("------------------------------------------------");
   }



public static void Pattern10(){
	     System.out.println("Pattern 10 :");
		  System.out.println();
	  for (int i = 1; i <= 9; i+=2)
        {
		  
            for (int j = i; j <=9; j+=2)
				
            {
                System.out.print(j + " ");
				
            }
            System.out.println();
        }
       System.out.println("------------------------------------------------");
   }

}
