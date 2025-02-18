class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for (int i = left; i <= right; i++) {
            // i가 완전제곱수인지 판별 (제곱근이 정수면 완전제곱수)
            if (Math.sqrt(i) == (int)Math.sqrt(i)) {
                answer -= i; // 약수 개수가 홀수 → 빼기
            } else {
                answer += i; // 약수 개수가 짝수 → 더하기
            }
        }
        
        return answer;
    }
}
