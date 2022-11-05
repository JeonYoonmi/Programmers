public class 짝수는싫어요 {
	public static int[] solution(int n) {
		// 내 풀이
        int[] answer = {};
        int[] arr = new int[n];	
        
        int idx = 0;
        for(int i = 1; i <= n; i++) {
        	if(i % 2 != 0) {
        		arr[idx] = i;
        		idx++;
        	}
        }
        
        answer = new int[idx];
        for (int i = 0; i < answer.length; i++) {
			answer[i] = arr[i];
		}
        
        return answer;
        
        // 다른 사람 풀이
        int cnt = 0;
        if(n % 2 == 0) cnt = n / 2;
        else cnt = n / 2 + 1;
        
        int[] answer = new int[cnt];
        int num = 1;
        
        for(int i = 0; i < answer.length; i++) {
        	answer[i] = num;
        	num += 2;
        }
        
        return answer;
    }
}