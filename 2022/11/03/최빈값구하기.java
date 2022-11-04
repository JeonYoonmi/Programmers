public static int solution(int[] array) {
    	// 내 풀이
        int answer = 0;
        int[][] mode = {{array[0], 1}};
        int[][] newMode;
        
        for(int j = 0; j < array.length; j++){
        	System.out.println(array[j]);
        }
        
        boolean flag = false;
        int idx = 0;
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < mode.length; j++){
                if(mode[j][0] == array[i]){
                	flag = true;
                	idx = j;
                }
            }
            
            
            if(flag){
            	System.out.println("true : " + mode[idx][0] + "/" + mode[idx][1]);
                mode[idx][1]++;
            }else{
            	System.out.println("before - mode length : " + mode.length);
            	newMode = new int[mode.length + 1][2];
            	System.out.println("after - mode length : " + mode.length);
            	for(int j = 0; j < mode.length; j++) {
            		for(int k = 0; k < 2; k++) {
            			newMode[j][k] = mode[j][k];
            		}
            	}
            	
            	mode = new int[newMode.length][2];
            	for(int j = 0; j < newMode.length; j++) {
            		for(int k = 0; k < 2; k++) {
            			mode[j][k] = newMode[j][k];
            		}
            	}
            	
            	mode[mode.length - 1][0] = array[i];
            	mode[mode.length - 1][1] = 1;
            }
            
            flag = false;
        }
        
        for(int j = 0; j < mode.length; j++){
        	System.out.println("mode - " + j + " : " + mode[j][0] + "/" + mode[j][1]);
        }
        
        int n = mode[0][1];
        answer = mode[0][0];
        if(mode.length != 1) {
        	for(int i = 1; i < mode.length; i++){
                if(mode[i][1] > n){
                	System.out.println("res : " + mode[i][1] + " > " + n);
                    n = mode[i][1];
                    answer = mode[i][0];
                    System.out.println(n + "/" + answer);
                }else if(mode[i][1] == n) {
                	System.out.println("res : " + mode[i][1] + " = " + n);
                	answer = -1;
                }
            }
        }
        
        return answer;
        
    	// 다른 사람 풀이
		int answer = 0;
		int arr_max = 0;	// 배열 크기 지정하기 위함
		 
		for (int i = 0; i < array.length; i++) {
		    if (array[i] > arr_max) {
		        arr_max = array[i];	// 배열 크기 확인, 배얄에 들어있는 가장 큰 값 구함
		    }
		}
		 
		int[] count = new int[arr_max + 1];
		int max = 0;	// 최빈값 구하기 위해 몇 번 count됐는지
		 
		int n = 0;	// count 값이 같은지 책정(flag 역할)
		 
		for (int i = 0; i < array.length; i++) {
		     count[array[i]]++;	// 배열 idx로 해당 숫자 표시
		}
		
		// 최빈값 찾기
		for (int i = 0; i < count.length; i++) {
		    if (count[i] > max) {
		        max = count[i];
		        answer = i;
		    }
		}
		
		// 최빈값이 여러개인지 확인
		for (int i = 0; i < count.length; i++) {
		    if (count[i] == max) {
		        n++;
		    }
		}
		
		// 최빈값이 여러개인 경우 -1 반환
		if (n > 1) 
		    answer = -1;
		 
		return answer;
    }