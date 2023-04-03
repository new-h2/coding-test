import java.io.*;
import java.util.*;

public class Main{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        
        long A = Long.parseLong(str[0]);
        long B = Long.parseLong(str[1]);
        long C = Long.parseLong(str[2]);
        
        // int자료형인 경우 2,147,483,647 보다 큰경우 불가 
        // 10¹²이라고 주어져서 long 타입으로 받아야한다.
  
        System.out.print(A+B+C);
    }    
}