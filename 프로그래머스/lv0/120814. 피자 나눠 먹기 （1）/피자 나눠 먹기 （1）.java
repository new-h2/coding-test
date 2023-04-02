
class Solution {
    public int solution(int n) {
       
        return n%7 == 0 ? n/7 : n/7+1; 
        // 삼항연산자를 사용하는 방법 
        // (조건) ? true 일 때 값 : false 일 때 값 
        // return (n+6)/7; 
    }
}