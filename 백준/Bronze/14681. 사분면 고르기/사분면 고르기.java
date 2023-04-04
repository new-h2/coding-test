import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        
        // x,y가 모두 양수이면 A 1
        // x,y가 모두 음수이면 C 3
        // x양수 y음수 D 4
        // x음수 y양수 B 2
        
        if( x > 1 ){
            if(y > 1){
            // x,y가 모두 양수이면 A 1
               System.out.print(1);
            }else{
               // x양수 y음수 D 4
               System.out.print(4);
            }
        }else{
            if(y > 1){
                // x음수 y양수 B 2
                System.out.print(2);
            }else{
                // x,y가 모두 음수이면 C 3
                System.out.print(3);
            }
        }
    }
}