package P20221105;

public class ���������ιޱ� {
	/*
		- ����
			�Ӿ��̳� �ʰ��Դ� 10�� �� �̻� ��� 5%, 30�� �� �̻� ��� 10%, 50�� �� �̻� ��� 20%�� �������ݴϴ�.
			������ ���� ���� price�� �־��� ��, �����ؾ� �� �ݾ��� return �ϵ��� solution �Լ��� �ϼ��غ�����.
		
		- ���ѻ���
			10 �� price �� 1,000,000
				price�� 10�� ������(1�� �ڸ��� 0) �־����ϴ�.
			�Ҽ��� ���ϸ� ���� ������ return�մϴ�.
	 */
	// �� Ǯ��
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
	
	// �ٸ���� Ǯ��
	public int solution2(int price) {
		int answer = 0;
        double ratio=((price>=500000)?(0.8):((price>=300000)?(0.9):((price>=100000)?(0.95):(1.0))));	// ���׿����ڸ� �̿��ؼ� ���ο� ����
        answer = (int)(price*ratio);
        return answer;
	}
}
