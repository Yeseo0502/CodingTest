def solution(num, k):
    num = str(num)
    k = str(k) #str은 문자 하나씩 반복 가능하게 함
    for i in range(len(num)) :
        if(num[i] == k ) :
            return i+1
    else :
            return -1