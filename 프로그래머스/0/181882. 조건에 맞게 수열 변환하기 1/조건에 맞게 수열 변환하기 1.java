class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>=50){
                //50보다 크면?
                if(arr[i]%2==0)
                    answer[i]=arr[i]/2;
                else
                    answer[i]=arr[i];
            }
            else{
                //나머지
                if(arr[i]%2==1)
                    answer[i]=arr[i]*2;
                else
                    answer[i]=arr[i];
            }
        }
        return answer;
    }
}