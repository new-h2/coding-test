import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int sum = Integer.parseInt(br.readLine());
        int count = Integer.parseInt(br.readLine());
            
        // count 만큼 값을 받아서 
        // 가격 x 개수 계산 
        // sum값과 비교해서 0이면 Yes출력
        // 0 이아니면 가격이 다른 것이니까No출력
        
        for(int i=1; i<=count; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int price = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            sum = sum -( price * num);
        }
        if(sum == 0 ) System.out.print("Yes");
        else System.out.print("No");
        
    }
}