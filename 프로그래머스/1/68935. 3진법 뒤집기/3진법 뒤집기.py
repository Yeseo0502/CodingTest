def solution(n):
    step1 = ''
    while n > 0:
        step1 = str(n % 3) + step1
        n //= 3
    step2 = step1[::-1]
    return int(step2, 3)