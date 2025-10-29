function solution(arr1, arr2) {
    var answer = 0;
    let one = 0;
    let two = 0;
    if(arr1.length == arr2.length){
        for(let i=0; i<arr1.length; i++){
            one+=arr1[i];
            two+=arr2[i];
        }
        if(one != two)
            answer = (one>two)? 1 : -1;
    }else{
        answer = (arr1.length>arr2.length) ? 1 : -1; 
    }
    return answer;
}