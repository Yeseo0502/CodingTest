class Solution {
    public int[] solution(int[] arr) {
        int count=0;
        for(int i =0; i<arr.length; i++){
            count+=arr[i];
        }
        int su=0;
        int[] answer = new int[count];
        for(int i = 0 ; i<arr.length; i++){
            for(int j=0; j<arr[i]; j++){
                answer[su++]+=arr[i];
            }
        }
        return answer;
    }
}