function solution(phone_number) {
    let su = phone_number.split("");
    var answer = '';
    var max_num = su.length-4;
    let count = 0
    for(let i=0; i<su.length; i++){
        if(count>=max_num)
            answer+=su[i]
        else{
            count++;
            answer+="*"
        }
    }
    return answer;
}