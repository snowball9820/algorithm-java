import java.util.*;
class Solution
{
    public int solution(String s)
    {
        
        //stack이 비어있지X
        //stack의 맨 위 값과 같으면 pop, 아니면 push를 s의 길이만큼 반복
        //stack이 비어있으면 1 아니면 0 return
        //스택 생성
        Stack<Character> stack = new Stack<>();
        //문자열의 길이만큼 반복
        for(int i=0; i<s.length(); i++){
            //현재 위치 해당 문자 변수 저장
            char curStr = s.charAt(i);
            //스택이 비어있지 않고 스택 맨위 문자가 temp와 같을 때 실행
            if(!stack.isEmpty() && stack.peek() == curStr){
                stack.pop();
            }else{
                //현재 문자 스택에 추가
                stack.push(curStr);
            }
        }
        //stack이 비어있으면 1 아니면 0 return
        return stack.isEmpty() ? 1:0;
    }
}