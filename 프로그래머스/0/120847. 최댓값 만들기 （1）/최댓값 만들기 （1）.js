function solution(numbers) {
    var answer = 0;
    let max=0;
    let index=0;
    for(let i=0; i<numbers.length; i++){
        if(numbers[i]>max){
            max=numbers[i];
            index=i;
        }
    }
    for(let i=0; i<numbers.length; i++){
        if(i!=index && answer<numbers[i]){
            answer = numbers[i];
        }
    }
    return answer*max;
}