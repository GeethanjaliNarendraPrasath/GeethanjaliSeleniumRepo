package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		    int n=8;
			int a=0; 
			int b=1; 
			System.out.println("Fibonacci Series");
			for (int i=1;i<=n;i++) {
				int sum=a+b;
				a=b;
				b=sum;
			System.out.println(b);	
			}

		}

	}
