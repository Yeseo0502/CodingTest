def solution(ineq, eq, n, m):
    answer = 0
    if eq in "!" :
        if ineq in ">" :
            if n>m :
                answer=1
        else :
            if n<m :
                answer=1
    else :
        if ineq in ">" :
            if n>=m :
                answer=1
        else :
            if n<=m :
                answer=1
        
    return answer