def solution(phone_number):
    answer = ''
    max_num = len(phone_number)-4;
    count = 0
    for i in range(0,len(phone_number)) :
        if(count>=max_num) :
            answer+=str(phone_number[i])
        else : 
            count+=1
            answer+="*"
    return answer