function solution(my_string, num1, num2) {
    var answer = [];
    for(let i=0; i<my_string.length; i++){
        answer.push(my_string[i]);
    }
    answer[num1]=my_string[num2];
    answer[num2]=my_string[num1];
    return answer.join('');
}