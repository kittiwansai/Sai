import java.util.Scanner;
class  BMI
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter w = ");
		double  w =sc.nextDouble();
		System.out.print("Enter h  = ");
		double h = sc.nextDouble()/100;
	    double bmi = w / (h*h);
		System.out.println(bmi);
	  
  }
}
