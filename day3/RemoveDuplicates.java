package week1.day3;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";
		String[] spilt = text.split(" ");
		for(int i=0;i<spilt.length;i++)
		{
			System.out.println(spilt[i]);
		}
			for(int j=0;j<spilt.length;j++)
			{
			for (int k = j + 1; k < spilt.length; k++) 
			{
                if (spilt[j].equals(spilt[k]))
                {
                    spilt[k]="";
                 }
             }
			 }
			System.out.println("spilt Duplicate words:");
		for(int l=0;l<spilt.length;l++)
		{
			System.out.print(spilt[l]+ " ");
		}

	}

}
