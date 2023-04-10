import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int num = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<num; i++){
            /*
              초기화
            클래스 영역에서 선언할 경우(전역변수)에는 컴파일러가 기본값(null,0 등)을 할당 해준다.
            메소드 영역에서 선언할 경우(지역변수)에는 초기화를 해주지 않아도 선언은 되지만 출력시 에러가 발생한다.
            출력시 에러가 발생하지 않는다면 로직을 실행하는 과정에서 예측할수 없는 값이 들어가 있을 가능성이크다.
            예측할 수 없는 값이 들어가는 것을 방지할 수 있도록 하기 위해서
            */
           st = new StringTokenizer(br.readLine()," ");
           int j = Integer.parseInt(st.nextToken());
           int k = Integer.parseInt(st.nextToken());
           int sum = j+k;
           sb.append(sum+"\n");
           //sb.append(Integer.parseInt(st.nextToken())+ Integer.parseInt(st.nextToken())).append('\n'); 
         }
        br.close();
        System.out.println(sb);
        
    }
}
