def solution(num_list):
    answer = 0
    one=0
    two=0
    for i in range(len(num_list)) :
        if i%2==0 : 
            two+=num_list[i]
        else :
            one+=num_list[i]
    if(one>two) :
        answer=one
    else :
        answer=two
    return answer