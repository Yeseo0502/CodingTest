class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        // 최대 길이만큼 배열 생성
        int[] temp = new int[intStrs.length];
        int count = 0;
        
        for (int i = 0; i < intStrs.length; i++) {
            
            // 부분 문자열 자르기
            String sub = intStrs[i].substring(s, s + l);
            
            // 문자열 -> 정수 변환
            int num = Integer.parseInt(sub);
            
            // k보다 크면 저장
            if (num > k) {
                temp[count] = num;
                count++;
            }
        }
        
        // 실제 크기 배열 생성
        int[] answer = new int[count];
        
        for (int i = 0; i < count; i++) {
            answer[i] = temp[i];
        }
        
        return answer;
    }
}