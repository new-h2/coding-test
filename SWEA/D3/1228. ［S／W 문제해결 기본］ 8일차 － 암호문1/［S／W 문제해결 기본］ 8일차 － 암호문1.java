import java.util.*;
import java.io.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);

        for(int t=1; t<=10; t++){
            LinkedList<Integer> list = new LinkedList<>();
            //초기화..! 안하면 
            //테스트케이스 10번돌면서 저장
            //암호문의 길이
            int n=sc.nextInt(); 
            for(int i=0; i<n; i++){
                //길이만큼 돌면서 저장
                list.add(sc.nextInt());
            }
        n=sc.nextInt();
        for(int i=0; i<n; i++){ //n번돌면서 
            String st = sc.next();		// I 
            int where = sc.nextInt();		// x위치다음
            int many =sc.nextInt();		// y개만
            for(int k =0; k< many; k++){		//몇개만큼
                list.add(where, sc.nextInt());		// 리스트에 추가 
                where++;
             //   1. I(삽입) x, y, s : 앞에서부터 x의 위치 
             //      바로 다음에 y개의 숫자를 삽입한다.
             //      s는 덧붙일 숫자들이다.[ ex) I 3 2 123152 487651 ]
            } 
        }
        System.out.print("#"+t+" "); //케이스번호 출력
        for(int j =0; j<10; j++){	//10개출력 
            System.out.print(list.poll()+" "); //리스트에서 꺼낸다 구분자공백
        }
        System.out.println(); //케이스마다 1줄씩 구분
        }
	}
}