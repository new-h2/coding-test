import java.util.Scanner;
import java.io.FileInputStream;
import java.util.*;
import java.io.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		
            //Scanner sc = new Scanner(System.in);
       		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            Queue<Integer> q = new LinkedList<>();
            //testcase10개 반복
            for(int i=1;  i<=10;  i++){
                //int n = sc.nextInt();
                br.readLine();
                 //queue초기화
                q.clear();
                //br.readLine()을 사용한 한줄을 넣기
                StringTokenizer st = new StringTokenizer(br.readLine());

                //8개 숫자를 q에 넣기
                for(int j=0; j<8; j++){
                //q.add(sc.nextInt());
                q.add(Integer.parseInt(st.nextToken()));
            }
                //감소시킬 -1
                int minus =1;
            while(true){
                //만약 숫자가 5보다 커지면 1로 초기화
                if(minus > 5) minus =1;
                //임시값 = q.poll() - minus
                // minus++
                int temp = q.poll() - minus++;
                //임시값이 0이라면
                // q에 0넣고 나가기
                if(temp <= 0){
                    q.add(0);
                    break;
                }
               // temp가 0초과인 경우는 위과정을 반복
                q.add(temp);
            }
                    System.out.print("#"+ i +" ");
                    for(int j =0; j<8; j++){
                        System.out.print(q.poll() + " ");
                    }
                    System.out.println();
          }
	}
}