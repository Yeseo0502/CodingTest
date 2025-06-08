def solution(num_list):
    answer = 0
    pp = 0
    x = 1
    for i in num_list :
        pp+=i
        x*=i
    if (pp*pp>x) : #합의 제곱이 더 크다면?
        answer+=1
    return answer