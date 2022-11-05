import java.util.Arrays;

public class 배열의평균값 {
	/*
	 	- 문제
	 		정수 배열 numbers가 매개변수로 주어집니다. 
	 		numbers의 원소의 평균값을 return하도록 solution 함수를 완성해주세요.
	 	
	 	- 제한사항
	 		0 <= numbers의 원소 <= 1000
	 		1 <= numbers의 길이 <= 100
	 		정답의 소수부분이 .0 또는 .5인 경우만 입력으로 주어집니다.
	 */
	public static double solution(int[] numbers) {
        double answer = 0;
        
        System.out.println("length : " + numbers.length);
        
        double sum = 0;
        for(int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }
        
        System.out.println("sum : " + sum);
        
        answer = sum / numbers.length;
        
        return answer;
    }
	
	public double solution2(int[] numbers) {
        return Arrays.stream(numbers).average().orElse(0);
    }
}
