import java.util.Scanner;
class LoopExample 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Amount");
		int sc = scan.nextInt();

		if( (sc>=0)&&(sc<=999) ){
         System.out.println("You hava purchased for rupess " +sc + " So you have 0% Discound ");
		 System.out.println("Total Amount is : " + sc);
		}
      else if(sc>=1000){
		  System.out.println("You hava purchased for rupess " +sc + " So you have 10% Discound");
		  int finalprice=(sc*10)/100;
		  int price=sc-finalprice;
           System.out.println("Total Amount is : " +price);
	  }
	  else{
		   System.out.println("Enter Valid Amount");
	  }

		

	}
}
