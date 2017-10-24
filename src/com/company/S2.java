package com.company;

/**
 * Created by Nataliya on 09.06.2017.
 */
public class S2 {
    public int solution2(int[] A) {
        // write your code in Java SE 8
        int groupCount = 0;
        int startIndex = 0;
        int indexMin = 0;
        while (startIndex <= A.length - 1){
            int min = A[startIndex];
            for (int i = startIndex; i <= A.length - 1; i++){
               if (A[i] <= min) {
                    min = A[i];
                    indexMin = i;
                }
            }
            startIndex = indexMin+1;
            groupCount++;
        }
        return groupCount;
    }

    public static void main(String[] args) {
        S2 s2 = new S2();
        int [] k2 = new int[] {1,5,4,9,8,7,12,13,14,2,3,7,10,4,6,7,8,15,10};
        int k = s2.solution2(k2);
        System.out.println(k);
    }
}
