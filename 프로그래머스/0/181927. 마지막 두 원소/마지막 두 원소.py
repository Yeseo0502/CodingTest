def solution(num_list):
    answer = []
    finsh = num_list[len(num_list)-1]
    two = num_list[len(num_list)-2]
    for i in num_list : 
        answer.append(i)
    if(finsh > two) :
        answer.append(finsh-two)
    elif finsh <= two :
        answer.append(finsh*2)
    return answer