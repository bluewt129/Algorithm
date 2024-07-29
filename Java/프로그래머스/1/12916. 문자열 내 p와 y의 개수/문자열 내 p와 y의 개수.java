class Solution {
    boolean solution(String s) {
        boolean answer = true;
        boolean f = false;
        int psum = 0;
        int ysum = 0;
        
        String lows = s.toLowerCase();
        
        String[] sarr = lows.split("");
        
        for(int i=0; i<s.length(); i++){
            if(sarr[i].equals("p")){
                psum++;
            }
            if(sarr[i].equals("y")){
                ysum++;
            }
        }
        
        if(psum == ysum){
            return answer;
        }
        return f;
    }
}