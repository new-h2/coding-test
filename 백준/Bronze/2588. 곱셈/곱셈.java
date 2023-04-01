import java.util.*;
import java.io.*;

class Main {
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        
        System.out.println(A*(B%10));    // 일의자리수 곱한 값
        System.out.println(A*((B%100)/10));    // 십의자리수 곱한 값
        System.out.println(A*(B/100));    // 백의자리수 곱한 값
        System.out.println(A*B);        // 세자리수*세자리수
    }
}