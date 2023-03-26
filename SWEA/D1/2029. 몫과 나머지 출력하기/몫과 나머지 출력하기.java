import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{	
		Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

		for(int i =1; i<=T; i++){
        int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("#"+i+" "+ a/b +" "+ a%b);
        }
	}
}