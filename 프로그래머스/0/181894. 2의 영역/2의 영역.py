def solution(arr):
    answer = []
    s = 0
    end = 0
    for i in range(0,len(arr)) :
        if(arr[i] == 2) :
            s = i
            break
    for j in range(len(arr)-1,-1,-1) :
        if(arr[j] == 2) :
            end = len(arr)-j
            break
    for i in range(s,j+1) :
        answer.append(arr[i])
    if(end==0) :
        answer[0]=-1
    return answer