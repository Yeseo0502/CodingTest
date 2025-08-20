def solution(a, b, c):
    answer = a+b+c
    count = 0
    if a==b :
        count+=1
    if a==c : 
        count+=1
    if b==c :
        count+=1
    if count>=1 :
        answer*=((a*a)+(b*b)+(c*c))
        if count==3 :
            answer*=((a*a*a)+(b*b*b)+(c*c*c))
    return answer