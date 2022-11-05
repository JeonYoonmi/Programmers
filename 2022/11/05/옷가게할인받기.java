package P20221105;

public class 못가게할인받기 {
	/*
		- 문제
			머쓱이네 옷가게는 10만 원 이상 사면 5%, 30만 원 이상 사면 10%, 50만 원 이상 사면 20%를 할인해줍니다.
			구매한 옷의 가격 price가 주어질 때, 지불해야 할 금액을 return 하도록 solution 함수를 완성해보세요.
		
		- 제한사항
			10 ≤ price ≤ 1,000,000
				price는 10원 단위로(1의 자리가 0) 주어집니다.
			소수점 이하를 버린 정수를 return합니다.
	 */
	// 내 풀이
	class Solution {
	    public int solution(int price) {
	        int answer = 0;
	        
	        if(price < 100000)
	        	answer = price;
	        else if(100000 <= price && price < 300000)
	        	answer = (int) (price * 0.95);
	        else if(300000 <= price && price < 500000)
	        	answer = (int) (price * 0.9);
	        else
	        	answer = (int) (price * 0.8);
	        
	        return answer;
	    }
	}
	
	// 다른사람 풀이
	public int solution2(int price) {
		int answer = 0;
        double ratio=((price>=500000)?(0.8):((price>=300000)?(0.9):((price>=100000)?(0.95):(1.0))));	// 삼항연산자를 이용해서 할인울 구합
        answer = (int)(price*ratio);
        return answer;
	}
}
