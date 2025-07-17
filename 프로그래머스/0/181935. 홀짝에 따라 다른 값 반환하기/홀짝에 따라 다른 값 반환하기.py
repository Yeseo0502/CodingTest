def solution(n):
    answer = 0
    check = 0
    if n%2==1 :
        check=1
    for i in range(0,n+1) :
        if check==1 :
            if i%2==1 :
                answer+=i
        elif i%2==0 :
            answer+=i*i;
    return answer