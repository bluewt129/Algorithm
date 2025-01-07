import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        // 1. 숫자를 문자열로 변환
        String strn = Long.toString(n);

        // 2. 문자열을 배열로 변환
        String[] stan = strn.split("");

        // 3. 내림차순 정렬
        Arrays.sort(stan, Collections.reverseOrder());

        // 4. 정렬된 배열을 다시 문자열로 합치고 long으로 변환
        String sortedStr = String.join("", stan);
        return Long.parseLong(sortedStr);
    }
}
