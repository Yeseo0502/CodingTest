def solution(sides):
    answer = 0
    max_sides=max(sides)
    if max_sides < sum(sides)-max_sides :
        answer=1
    else :
        answer=2
    return answer