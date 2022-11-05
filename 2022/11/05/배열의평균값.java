import java.util.Arrays;

public class �迭����հ� {
	/*
	 	- ����
	 		���� �迭 numbers�� �Ű������� �־����ϴ�. 
	 		numbers�� ������ ��հ��� return�ϵ��� solution �Լ��� �ϼ����ּ���.
	 	
	 	- ���ѻ���
	 		0 <= numbers�� ���� <= 1000
	 		1 <= numbers�� ���� <= 100
	 		������ �Ҽ��κ��� .0 �Ǵ� .5�� ��츸 �Է����� �־����ϴ�.
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
