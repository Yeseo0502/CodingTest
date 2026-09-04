using System;

public class Solution {
    public int solution(int[] array) {
        int max = 0;

        foreach (int num in array) {
            if (num > max) {
                max = num;
            }
        }

        int[] count = new int[max + 1];

        foreach (int num in array) {
            count[num]++;
        }

        int maxCount = 0;

        foreach (int num in count) {
            if (num > maxCount) {
                maxCount = num;
            }
        }

        int answer = -1;
        int same = 0;

        for (int i = 0; i < count.Length; i++) {
            if (count[i] == maxCount) {
                answer = i;
                same++;
            }
        }

        if (same > 1) {
            return -1;
        }

        return answer;
    }
}
