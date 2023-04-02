
class Solution {
    public int solution(int n) {
        int pizza;
        
        if(n%7 == 0){
            pizza = n/7;
        }else{
            pizza = (n/7)+1;
        }
        
        return pizza;
        
    }
}