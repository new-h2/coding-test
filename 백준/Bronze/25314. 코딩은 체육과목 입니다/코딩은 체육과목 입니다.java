import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int num  = Integer.parseInt(br.readLine());
        num = num / 4;
       
        StringBuilder sb = new StringBuilder();
        // num을 4로나누기 나온값만큼 long출력
            
        for(int i=0; i<num; i++){
           // i * long만큼 넣기
           sb.append("long ");
         }
        sb.append("int"); //마지막에 int출력
        System.out.print(sb);
        
    }
}