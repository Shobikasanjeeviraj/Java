import java.util.Scanner;
class Attendence 
{
	public static void main(String[] args) 
	{
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter Number of Class held");
    int classheld=scan.nextInt();

	
    System.out.println("Enter Number of class Attend");
    int classattend=scan.nextInt();
   
   int percentage=(classattend *100/classheld);
    
	if((percentage>=75)&&(classattend<=classheld)&&(classattend>=0)&&(classheld>=0)){
       System.out.println("you have attened " + percentage + "% of class");
        System.out.println("you are allowed to sit in the exam");
	}
	else if((percentage<75)&&(classattend<=classheld)&&(classattend>=0)&&(classheld>=0)){
        System.out.println("you have attened "+ percentage + "% of class");
        System.out.println("you are not allowed to sit in the exam");
	}
	else if((classattend>classheld)||(classattend<0)||(classheld<0)){
        System.out.println("Enter Valid Class Attended days");
	}

	}
}
