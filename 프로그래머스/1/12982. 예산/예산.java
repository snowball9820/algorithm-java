import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        //최소 금액인 부서 먼저 합산해야 최대한 많이 줄 수 있음
        //
        int answer = 0;
        
        Arrays.sort(d);
        
        if(d[0]>budget){
            return 0;
        }
        for(int i=0; i<d.length; i++){
            if(budget >= d[i]){
                budget-=d[i];
                answer++;
            }
        }
        return answer;
    }
}