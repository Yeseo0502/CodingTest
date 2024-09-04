class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        int su=0;
        for(int i=0; i<arr.length; i++){
            su+=arr[i];
        }
        answer=(double)su/arr.length;
        return (double)answer;
    }
}