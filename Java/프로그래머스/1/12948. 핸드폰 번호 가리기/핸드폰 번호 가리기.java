class Solution {
    public String solution(String phone_number) {
        String answer = "";
        String p2 = "";
        
        p2 = phone_number.substring(phone_number.length()-4, phone_number.length());
        
        for(int i=0;i<phone_number.length()-4;i++){
            answer += "*";
        }
        
        answer += p2;
        
        
        return answer;
    }
}