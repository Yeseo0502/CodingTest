def solution(s):
    answer=0
    pairs = {')': '(', ']': '[', '}': '{'}
    for i in range(len(s)):
        sub = s[i:] + s[:i]
        stack = []
        for j in sub:
            if stack and stack[-1] == pairs.get(j,''):
                stack.pop()
            else:
                stack.append(j)
        if not stack:
            answer+=1
            
    return answer