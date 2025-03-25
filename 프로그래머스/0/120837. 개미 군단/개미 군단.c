#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int hp) {
    int answer = 0;
    while(hp>0){
        if(hp>=5){ //장군
            hp-=5;
            answer++;
        }
        else if(hp>=3){
            hp-=3;
            answer++;
        }
        else {
            hp-=1;
            answer++;
        }
    }
    return answer;
}