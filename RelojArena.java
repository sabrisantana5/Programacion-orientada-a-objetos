import java.util.Arrays;
import java.util.Scanner;

public class RelojArena
{
	public static void main(String[] args)
	{
		int higher;
		int[][] array = {{1,2,3,4,5,6},{1,2,3,4,5,6},{1,2,3,4,5,6},{1,2,3,4,5,6},{1,2,3,4,5,6},{1,2,3,4,5,6}};

		higher = mhigher(array);
		System.out.println(higher);
	}
	public static int mhigher(int[][] a)
	{
		int temp=0;
		int higher = a[0][0] + a[0][1] + a[0][2] + a[1][1] + a[2][0] + a[2][1] + a[2][2];
		for(int i=0;i < a.length-2;i++)
		{
			for(int j = 0;j < a.length-2;j++)
			{
				temp = a[i][j]+a[i][j+1]+a[i][j+2]+a[i+1][j+1]+a[i+2][j]+a[i+2][j+1]+a[i+2][j+2];
				if (temp>higher)
				higher = temp;
			}
		}
		return higher;
	}
}