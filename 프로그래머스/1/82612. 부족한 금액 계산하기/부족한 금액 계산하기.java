class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long sum = 0;
        
        //count 1부터 count 만큼 반복하고 sum에 곱한 수 더함
        for(int i=1; i<count+1; i++){
            sum+=price*i;
        }
        //합이 가진 돈보다 크면 부족한 금액만큼 출력 금액 부족하지 않으면 0 return
        return answer = ((sum>money)?sum-money:0);
    }
}