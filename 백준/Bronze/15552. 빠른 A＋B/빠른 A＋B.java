import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int num = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<num; i++){
           st = new StringTokenizer(br.readLine()," ");
           sb.append(Integer.parseInt(st.nextToken())+ Integer.parseInt(st.nextToken())).append('\n'); 
           /*
           int j = Integer.parseInt(st.nextToken());
           int k = Integer.parseInt(st.nextToken());
           sum = j+k;
           sb.append(sum+'\n');
           ???
            */
         }
        br.close();
        System.out.println(sb);
        
    }
}