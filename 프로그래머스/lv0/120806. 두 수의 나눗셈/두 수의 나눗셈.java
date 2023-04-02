
class Solution {
    public int solution(int num1, int num2) {
        double answer = (double) num1/num2 * 1000;
        // 풀이 
        // 정수의 연산이 실수의 값이 출력되야하니까 
        // floor이나 double로 변환 후 int로 형변환 후 출력
        // floor 4byte 소수점 7자리 / double 8byte 소수점 15자리
        
        // 실수 1.
        // Math.trunc쓰고싶었는데 javascript였다....
        
        //  실수 2.
        //  (double)((num1/num2) * 1000); 가로를 쓰면 안됨
        //   (((double)num1/(double)num2) *(double)1000) 모든 변수에 (double) 변환을 해주거나 ,
        // ((double) num1/num2) * 1000 이렇게 한번만 해줘야 가능하다.
        
        // 1. 이항연산자는 두 연산자의 값이 같아야 연산가능
        // 2. 예시로 1 /16 일경우 0 을 곱하면 무조건 0 이기때문에 테스트 패스 불가 
        // 3. 산술연산의 경우 두 피연산자의 타입 중 더 큰 타입으로 일치시키는 것
        // 4. (double) a + b  
        //    a + b(double)
        //    (double) a + (double) b
        
        return (int)answer;
    }
}