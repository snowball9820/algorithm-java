import java.util.*;
class Solution {
    public int solution(int[] elements) {
        //길이 1->7,9,1,1,4
        //길이 2->7+9=16,9+1=10,1+1=2,1+4=5,4+7=11
        //길이 3->7+9+1=17,9+1+1=11,1+1+4=6,1+4+7=12,4+7+9=20
        //-> 중복 x set 
        //정수형 저장 hashset
        //elements 배열 길이만큼 반복
        //부분배열합 저장, 현재 부분 배열에서 제외될 요소 인덱스, 현재 부분 배열 요소 인덱스 
        //현재 부분 배열 합 계산
        //set 사이즈 반환
        int answer = 0;
         HashSet<Integer> set = new HashSet<Integer>();


         for(int i=1; i<=elements.length; i++){

            int sum = 0;
            int index = 0;
            int k = 0;

            for(int j=0; j< elements.length+i; j++){

                int m = k % elements.length;

                if(k == (elements.length-1)+i){
                    break;
                }

                if(j>=i){
                    sum += elements[m];
                    sum = sum-elements[index];
                    index++;
                }else{
                    sum += elements[m];
                }

                set.add(sum);

                k++;

            }
        }

        answer = set.size();

        return answer;
    }
}