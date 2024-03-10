class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        if(s.length() == 4 || s.length() == 6){
            for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
                answer = false;
                break;
            }else{
                answer = true;
            }
        }
            }else{
                answer = false;
            }
        
        return answer;
    }
}