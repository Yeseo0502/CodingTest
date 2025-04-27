import math
def solution(n):
    answer = 2
    d = float(math.sqrt(n))
    if d%1==0 :
        answer=1
    return answer