import java.io.*;
import java.util.*;

public class Main{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(br.readLine()); 
        
        if( (year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            /* 윤년조건
                1. 4의 배수 O 
                2. 4의 배수지만 100으로 나눠지면 x
                3. 400 배수이면 윤년
            */ 
            System.out.print("1");
        }else{
            System.out.print("0");
        }
    }
}