class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for(int i = 0; i <= array.length - 1; i++){
            for(int j = 0; j < array.length; j++){
                if(array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        int mid = array.length / 2;

        answer = array[mid];

        return answer;
    }
}

// =========== 다른 해결 방법 ===========
class Solution {
    public int solution(int[] array) {
        int answer = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[i]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        answer = array[array.length / 2];

        return answer;
    }
}

/*
 - comment
   2중 for문 쓸 때 j 범위를 0부터가 아닌 i 부터 해서 이미 해결된 앞부분까지 할 필요가 없음.
*/
