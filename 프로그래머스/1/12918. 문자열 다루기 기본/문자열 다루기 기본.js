function solution(s) {
    var answer = true;
    if(s.length !==4 && s.length!==6){
        answer = false;
    }
    for(let i of s){
        if(i<'0' || i>'9'){
            answer = false;
        }
    }
    return answer;
}