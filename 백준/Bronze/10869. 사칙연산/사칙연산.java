import java.io.*;
import java.util.*;

class Main{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //String만 반환하기때문에 Integer.parseInt
        StringTokenizer st = new StringTokenizer(br.readLine()); 
        //값 여러개 받을때 사용,구분자 띄어쓰기 
        int A = Integer.parseInt(st.nextToken()); //값 한개씩int로 변환
        int B = Integer.parseInt(st.nextToken());
        //첫째 줄에 A+B, 둘째 줄에 A-B, 셋째 줄에 A*B, 넷째 줄에 A/B, 다섯째 줄에 A%B를 출력한다.
        System.out.println(A+B);
        System.out.println(A-B);
        System.out.println(A*B);
        System.out.println(A/B);
        System.out.println(A%B);
    }
}