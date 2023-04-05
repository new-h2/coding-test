import java.io.*;
import java.util.*;

public class Main{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());
        int num3 = Integer.parseInt(st.nextToken());
        
        // 1~6까지의 수
        // 같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다
        // 같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다. 
        // 모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.  
        
        
        if(num1 != num2 && num2 != num3 && num1 != num3){
           // 가장큰수 어떻게 알아?
            int max;
            if(num1 > num2){
                if(num1 > num3){
                    max=num1;
                }else{
                    max=num3;
                }
                
            }else{ // num2> num1
                if(num2 > num3){
                    max = num2;
                }else{
                    max = num3;
                }
            }
            System.out.print(max*100);
            }else if(num1 == num2 && num1 == num3 ){
             // 같은숫자3개라는건 다 같은숫자니까 num1
            System.out.print(10000+(num1 * 1000));
            }else if(num1 == num2 || num1 == num3){
                System.out.print( 1000+ ( num1 * 100));
               }else{
                //(num2 == num3)
                System.out.print( 1000+ ( num2 * 100));
           }
            
          
        
    }
}