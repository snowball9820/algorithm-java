import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        
        //stack을 선언하고
        //전달 받은 배열만큼 반복문 돌고
        //첫 번째 숫자 stack에 삽입
        //stack의 최상단 peek이 arr[i]의 값과 일치하지 않을 때만 push
        //결과는 stack 사이즈와 동일
        //stack에서 꺼내는 값은 LIFO의 실제 배열의 역순
        
        Stack<Integer> stack=new Stack<Integer>();
        
        for(int i=0; i<arr.length; i++){
            
            if(i==0){
                stack.push(arr[i]);
            }else if(stack.peek() != arr[i]){
                stack.push(arr[i]);
            }
        }
        
        answer=new int[stack.size()];
        
        for(int i=stack.size()-1; i>=0; i--){
            answer[i]=stack.pop();
        }
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}