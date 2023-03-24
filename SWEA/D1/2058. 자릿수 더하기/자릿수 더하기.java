import java.util.Scanner;
import java.io.FileInputStream;


class Solution
{
	public static void main(String args[]) throws Exception
	{
		
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

        int a = T / 1000;
        int b = (T % 1000) / 100;
        int c = (T % 100) / 10;
        int d = T % 10;

        System.out.println(a+b+c+d);		
	}
}