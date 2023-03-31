import java.io.*;
import java.util.*;

public class Main {
    public static void main (String args[]) throws IOException {
        /* Scanner보다 BufferedReder가 속도가 빠르기때문에 앞으로 사용
         Scanner는 문자입력시 바로 전달,
         Buffer는 문자입력시 버퍼로 전달, 버퍼가 가득차거나 개행문자가 나타나면 한번에 전송
         
         precision float는 6자리 , double 15자리까지 오차없이 표현
         Double로 받는 이유는 출력값과 정답의 상대오차가 10^-9이하여야하기 때문, int로 받으면 1/3의결과는 0이다
         */
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));// 선언
        StringTokenizer st = new StringTokenizer(br.readLine()); // 여러개의값 받을때 사용, 띄어쓰기로 default 구분자사용
        Double a = Double.parseDouble(st.nextToken());
        Double b = Double.parseDouble(st.nextToken()); 

        if(a>0 && b< 10){
            System.out.print(a/b);    
        }
    }
}