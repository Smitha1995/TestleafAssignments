package week1.day1.assignments;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int num=13;
		boolean isPrime=true;
		
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				isPrime=false;
				break;
			}
		}
		if(isPrime)
		{
			System.out.println(num+ " is a prime number");
		}
		else
		{
			System.out.println(num+" is not a prime number ");
		}
		
		System.out.println("=========================");
		
		int input=13;
		
		int count =0;
		
		for(int i=1;i<=input;i++)
		{
			
			if(input % i ==0)
				count =count+1;//increase  count when it is successfully divided
			
		}
		
		if(count==2)
		{
			System.out.println("Given number is a prime number");
		}
		else
		{
			System.out.println("Given number is not a prime number");
		}
	}

}
