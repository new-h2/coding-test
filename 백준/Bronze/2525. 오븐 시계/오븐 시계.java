import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int H = Integer.parseInt(st.nextToken()); // 시
        int M = Integer.parseInt(st.nextToken()); // 분
        int C = Integer.parseInt(br.readLine()); // 요리 시간
        
        H += C / 60;
        M += C % 60;

        if( M >= 60){
            H += 1;    
            M -= 60;
        }

        if(H >= 24){ //23시 .. 24 = 0이니까
            H -= 24; 
        }

        System.out.println(H + " " + M);
      
    }
}