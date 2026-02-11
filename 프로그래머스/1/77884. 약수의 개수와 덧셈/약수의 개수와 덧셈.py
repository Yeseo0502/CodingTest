def solution(left, right):
    total = 0                         # 누적합을 저장할 변수
    for i in range(left, right + 1):  # left부터 right까지 반복
        count = 0                     # 약수 개수를 세는 변수
        for s in range(1, i + 1):     # 1부터 i까지 반복
            if i % s == 0:            # s가 i의 약수이면 개수 1개 증가
                count += 1
        if count % 2 == 0:            # 약수 개수가 짝수이면 더하고
            total += i
        else:                         # 약수 개수가 홀수이면 빼기
            total -= i
    return total 