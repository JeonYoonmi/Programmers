class 분수의덧셈 {
    public int[] solution(int denum1, int num1, int denum2, int num2) {
        int[] answer = new int[2];
        
		int num = 0;
		int denum = 0;
		
        if(num1 % num2 == 0 || num2 % num1 == 0){
            num = (num1 < num2) ? num2 : num1;
            
            if(num == num1){
                denum2 = denum2 * (num1 / num2);
            }else{
                denum1 = denum1 * (num2 / num1);
            }
            
            denum =  denum1 +  denum2;
            
        }else {
        	num = num1 * num2;
        	denum = denum1 * num2 + denum2 * num1;
        }
        
        int gcd = getGCD(num, denum);
        
        answer[0] = denum / gcd;
        answer[1] = num / gcd;
                
        return answer;
    }
    
    public int getGCD(int num1, int num2){
        if(num1 % num2 == 0){
            return num2;
        }
        
        return getGCD(num2, num1 % num2);
    }
}