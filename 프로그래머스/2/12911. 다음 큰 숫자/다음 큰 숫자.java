class Solution {
    public int solution(int n) {
        //n 다음 큰 수는 n보다 큰 자연수
        //n 다음으로 큰 수를 2진수로 변환했을 때 1의 갯수 같음
        //두 조건을 만족하고 그 중에서 가장 작은 수
        int answer = 0;
        //2진수 변환
        String str = Integer.toBinaryString(n);
        
        int strCount = 0;
        //2진수 변환 후 1의 개수
        strCount = Integer.bitCount(n);
        
        while(true){
            n++;
            if(strCount == Integer.bitCount(n)){
                answer = n;
                break;
            }
        }
        return answer;
    }
}