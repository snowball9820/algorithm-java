import java.util.*;
class Solution {
    public int solution(int[] ingredient) {
        //1231이면 햄버거 완성
        //사이즈가 4 이상 -> 1231이 맞는지 확인 하고 pop
    
        int answer = 0;
        Stack<Integer> stack=new Stack<>();
        for(int in : ingredient) {
            stack.push(in);
            
            if(stack.size()>=4) {
                
                //stack이 1231 연속으로 있는지 확인
                if(stack.get(stack.size()-1)==1 && stack.get(stack.size()-2)==3 && stack.get(stack.size()-3)==2 && stack.get(stack.size()-4)==1){
                    answer++;
                    stack.pop();
                    stack.pop();
                    stack.pop();
                    stack.pop();
                }
                    
            }
        }
        return answer;
    }
}