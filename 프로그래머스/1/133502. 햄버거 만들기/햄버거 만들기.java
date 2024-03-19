import java.util.*;
class Solution {
    public int solution(int[] ingredient) {
        //1231이면 햄버거 완성
        //사이즈가 4가 되면 1231이 맞는지 확인 하고 pop
    
        int answer = 0;
        Stack<Integer> stack=new Stack<>();
        for(int i=0; i<ingredient.length; i++){
            stack.push(ingredient[i]);
            if(stack.size()>=4){
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