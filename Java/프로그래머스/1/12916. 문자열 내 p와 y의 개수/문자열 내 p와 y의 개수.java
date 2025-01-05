class Solution {
    boolean solution(String s) {
        String str = s.toLowerCase();

        if (!str.contains("p") && !str.contains("y")) {
            return true;
        }

        int pcnt = 0;
        int ycnt = 0;

        for (char c : str.toCharArray()) {
            if (c == 'p') pcnt++;
            if (c == 'y') ycnt++;
        }
        return pcnt == ycnt;
    }
    
}