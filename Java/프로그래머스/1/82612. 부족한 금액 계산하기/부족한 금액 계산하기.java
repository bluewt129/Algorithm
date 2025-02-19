class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long pay = 0;
        
        for(int i=1;i<=count;i++){
            pay += price * i;
        }
        
        answer = money - pay;
        
        return answer<0?Math.abs(answer):0;
    }
}