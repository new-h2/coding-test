import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int num  = Integer.parseInt(br.readLine());
        num = num / 4;
       // num을 4로나누기 나온값만큼 long을 sb에 넣기
       // String은 final이기때문에 계속 값추가해줘야함,추가자동생성x
       // StringBuilder는 문자열값을 넣으면 추가로 생성되는 배열형태  
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<num; i++){
           sb.append("long "); //공백 
         }
        sb.append("int"); //마지막에 int출력
        System.out.print(sb);
        
    }
}