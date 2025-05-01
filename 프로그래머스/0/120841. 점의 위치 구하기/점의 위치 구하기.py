def solution(dot):
    answer = 0
    x=0
    y=0
    if dot[0]>0 : #x가 양수일때
        x=1
    if dot[1]>0 : #y가 양수일때
        y=1
    if (x==1 and y==1) : #(+ , +) 1사분면일 때
        answer=1
    elif (x==0 and y==1 ) :
        answer=2
    elif (x==0 and y==0) :
        answer=3
    elif (x==1 and y==0) :
        answer=4
    return answer