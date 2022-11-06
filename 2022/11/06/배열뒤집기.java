package P20221106;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class �迭������ {
	/*
		- ����
			������ ��� �ִ� �迭 num_list�� �Ű������� �־����ϴ�. 
			num_list�� ������ ������ �Ųٷ� ������ �迭�� return�ϵ��� solution �Լ��� �ϼ����ּ���.
		
		- �������
			1 �� num_list�� ���� �� 1,000
			0 �� num_list�� ���� �� 1,000
	 */
	
	// �� Ǯ��
	public static int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        
        for (int i = 0; i < num_list.length; i++) {
			answer[i] = num_list[num_list.length - (i + 1)];
		}
        
        return answer;
    }
	
	// ������ Ǯ��
	public int[] solution2(int[] numList) {
	       List<Integer> list = Arrays.stream(numList).boxed().collect(Collectors.toList());
	        Collections.reverse(list);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
