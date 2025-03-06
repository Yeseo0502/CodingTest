class Solution {
    public int solution(int[] sides) {
        int answer = 2;
        int max=0;
        int pp=0;
        for(int i=0; i<sides.length; i++){
            if(max<sides[i]){
                max=sides[i];
            }
            pp+=sides[i];
        }
        pp-=max;
        if(max<pp){
            answer=1;
        }
        System.out.print(pp+" "+max);
        return answer;
    }
}