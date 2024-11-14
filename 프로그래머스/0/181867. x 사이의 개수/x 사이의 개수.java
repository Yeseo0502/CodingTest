class Solution {
    public int[] solution(String myString) {
        int count=1;
        for(int i=0; i<myString.length(); i++){
            if(myString.charAt(i) == 'x'){
                count++;
            }
        }
        int [] answer=new int[count];
        int were=0;
        int j=0;
        for(int i=0; i<myString.length(); i++){
            if(myString.charAt(i)=='x'){
                if(j<count){
                    answer[j]=were;
                    j++;
                }
                were=0;
            }
            else{
                were++;
            }
        }
        answer[j]=were;
        //만약 맨 마지막에 x가 또 있다면?
        // if(j<count){
        //     answer[j]=were;
        // }
        return answer;
    }
}