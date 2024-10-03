class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int max=0;
        int index=0;
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]>max){
                max=numbers[i];
                index=i;
            }
        }
        for(int i=0; i<numbers.length; i++){
            if(i!=index && answer<numbers[i]){
                answer = numbers[i];
            }
        }
        System.out.print(answer+" "+max);
        return answer*max;
    }
}