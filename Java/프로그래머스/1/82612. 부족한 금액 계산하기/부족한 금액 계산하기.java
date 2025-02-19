class Solution {
    public long solution(int price, int money, int count) {
        // 등차수열의 합 공식 사용
        long totalCost = (long) price * count * (count + 1) / 2;
        
        // 부족한 금액 계산
        long shortfall = totalCost - money;
        
        // 부족한 금액이 없으면 0을 반환
        return shortfall > 0 ? shortfall : 0;
    }
}
