import java.util.*;

class Solution {
    public int solution(int n, int t) {
        int answer = 1;

        answer = n * (int)Math.pow(2, t);

        return answer;
    }
}
