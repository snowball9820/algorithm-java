import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        //일단 마지막 알파벳이랑 이어져야 하고
        //똑같은 단어X 
        //[번호,차례] return
        //틀린 사람이 없으면 [0,0] return
        //Map 사용
        //단어 중복확인, 초깃값 0,0
        Map<String, Boolean> map=new HashMap<>();
        int[] answer = {0,0};
        //첫 번째 단어가 아닌 경우에만 코드 실행(첫번째 단어는 비교할 필요 없음)
        //현재 단어와 이전 단어를 비교
        //이전 단어의 끝 글자와 현재 단어의 첫 글자가 다르거나 이미 나온 단어를 다시 말했다면 게임이 종료
        for(int i=0; i<words.length; i++){
            if(i!=0){
                //last 변수에 이전 단어를, now 변수에 현재 단어를 저장
                String last = words[i-1];
                String now = words[i];
                //전 단어의 끝 글자를 tail 변수에 저장하고, 현재 단어의 첫 글자를 head 변수에 저장
                char tail = last.charAt(last.length()-1);
                char head = now.charAt(0);
                
                //이미 나온단어인지 확인 or 이전 단어의 끝 글자와 현재 단어의 첫 글자가 다른지
                if(map.containsKey(now)||tail!=head){
                    // 잘못된 단어의 위치(인덱스)를 answer 배열에 저장하고 반
                    answer[0]=(i%n)+1;
                    answer[1]=(i/n)+1;
                    
                    return answer;
                }
            }
            //현재 단어를 map에 추가하여 중복 여부를 확인
            map.put(words[i],true);
        }

        return answer;
    }
}