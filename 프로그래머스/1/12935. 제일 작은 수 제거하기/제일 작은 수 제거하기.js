function solution(arr) {
    var answer = [];
    var arr_min=Math.min(...arr);
    if(arr.length>1){
        for(let i of arr){
            if(arr_min==i){
                console.log("최소값");
            }
            else{
                answer.push(i);
            }
        }
    }
    else{
        answer.push(-1);
    }
    return answer;
}