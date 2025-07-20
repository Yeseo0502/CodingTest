class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String su = "";
        for(int i=0; i<myString.length(); i++){
            if("A".equals(myString.substring(i,i+1))){
                su+="B";
            }
            else{
                su+="A";
            }
            // System.out.println(myString.substring(i,i+1));
        }
        System.out.print(su);
        if(su.contains(pat)){
            answer=1;
        }
        return answer;
    }
}