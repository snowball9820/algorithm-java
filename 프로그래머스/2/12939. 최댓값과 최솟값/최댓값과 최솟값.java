import java.util.*;

class Solution {
    public String solution(String s) {
        //공백 기준 분리
        //분리한 문자열 정수형으로 반환 후 최대 최소 구함
        String[] temp = s.split(" ");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for(int i=0; i<temp.length; i++){
            int num = Integer.parseInt(temp[i]);
            
            min = Math.min(min, num);
            max = Math.max(max, num);
            
        }
        
        String answer = " ";
        answer = min+" "+max;
        return answer;
    }
}