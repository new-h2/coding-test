import java.io.*;
import java.util.*;

public class Main{
    public static void main(String args[])throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int score = Integer.parseInt(br.readLine());
        String grade;
        
        switch(score / 10){
            case 10:
            case 9: {
                   grade = "A";
                 }     break;
            case 8:{
                   grade ="B";
                }  break;
            case 7: {
                    grade ="C";
                 }  break;
           case 6: {
                  grade ="D";
                }  break;
           default:{
                   grade ="F";
                 }  break;
        }
        System.out.print(grade);
    }
}