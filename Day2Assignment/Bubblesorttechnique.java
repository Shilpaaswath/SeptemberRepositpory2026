package Day2Assignement;

public class Bubblesorttechnique {

	public static void main(String[] args) {
		int a[] = {9,8,6,5,1};
		int i;
		int j;
		int temp;	
		for (i=0;i<a.length;i++)
		{
			for (j=0;j<(a.length-1);j++)
			{
				if (a[j] > a[j+1])
				{
					temp = a[j];
					a[j] = a[j+1];
					a[j+1]= temp;
				}
			}
		}
		for (j=0;j<a.length;j++)
		{
		System.out.print(a[j]+",");
		}

	}

}
