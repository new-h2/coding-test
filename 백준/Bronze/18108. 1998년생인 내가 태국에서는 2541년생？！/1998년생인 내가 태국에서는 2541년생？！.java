import java.util.*;
import java.io.*;

class Main{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int year= Integer.parseInt(br.readLine());
        if(year>1000 && year<3000){
            System.out.print(year-543);
        }
    }
}
