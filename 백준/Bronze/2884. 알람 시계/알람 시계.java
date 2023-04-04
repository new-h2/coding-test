import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer((br.readLine()));
        int H = Integer.parseInt(st.nextToken()); //시
        int M = Integer.parseInt(st.nextToken()); //분
        
        //(0 ≤ H ≤ 23, 0 ≤ M ≤ 59) 
        
        if( M < 45){
            //45분을 뺄거니까 45보다 작으면 음수가 되겠지
            H--;
            M = 60 - (45 - M);
            if(H < 0){
                H = 23; 
            }
            System.out.println(H + " " + M);
        }else{
            System.out.println(H + " " + (M - 45));
        }
    }
}