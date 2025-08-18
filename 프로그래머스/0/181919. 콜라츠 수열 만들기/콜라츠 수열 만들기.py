def solution(n):
    answer = [n]                # 1. answer list 생성
    while n != 1 :              # 2. n이 1이 되기 전까지 반복
        if n % 2 == 0 :         # 3. 조건문 : n이 짝수일 경우, 홀수일 경우
            n /= 2
        else :
            n = 3*n+1
        answer.append(n) 
    return answer