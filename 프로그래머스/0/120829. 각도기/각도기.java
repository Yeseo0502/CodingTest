class Solution {
    public int solution(int angle) {
        int answer = 0;
        if(angle>0 && angle<90) //예각
            answer+=1;
        else if(angle==90) //직각
            answer+=2;
        else if(angle>90 && angle<180)//둔각
            answer+=3;
        else if(angle == 180)
            answer+=4;
        return answer;
    }
}