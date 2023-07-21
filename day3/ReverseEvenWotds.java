package week1.day3;

public class ReverseEvenWotds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "I am a software tester";
		String[] spilt = test.split(" ");
		
		for(int i=0;i<spilt.length;i++) {
			System.out.println(spilt[i]);
			}
		
		System.out.println("\nOdd position words:");
		for(int j=0;j<spilt.length;j++)
		{
			if (j%2!=0)
			{
				System.out.println(spilt[j]);
			}
		}
		
		System.out.println("\nEven postion words in reverse:");
		for(int k=0;k<spilt.length;k++)
		{
			if (k%2==0)
			{
				char[] chars = spilt[k].toCharArray();
				for (int l=chars.length-1; l>=0; l--)
				{
                    System.out.print(chars[l]); 
                }
            }
			else 
            {
                System.out.print(spilt[k]+ " "); 
            }
	
			}

	}

}
