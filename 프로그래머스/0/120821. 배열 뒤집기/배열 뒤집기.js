function solution(num_list) {
    var answer = [];
    let arr=0;
    for(let i=num_list.length-1; i>-1; i--){
        answer[arr]=num_list[i];
        arr++;
    }
    return answer;
}