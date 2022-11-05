public class 피자나눠먹기_1 {
    public static int solution(int n) {
		// 내 풀이
        int answer = 0;
        
        if(n % 7 == 0) {
        	answer = n / 7;
        }else {
        	answer = n / 7 + 1;
        }
        
        return answer;
        
        // 다른 사람 풀이
        int answer = (n % 7) ? n / 7 : n / 7 + 1;
        return answer;
    }
}