package com.company;

import org.omg.CORBA.UserException;

import java.util.ArrayList;

/**
 * Created by Nataliya on 09.06.2017.
 */
public class S1 {
    public int solution(String A, String B) throws UserException2{
        char [] charA = A.toCharArray();
        char [] charB = B.toCharArray();
        int win = 0;
        try {
            if (charA.length != charB.length) throw new UserException2("Not equal");
            int [] intA = arrayInt(charA);
            int [] intB = arrayInt(charB);
            for (int i = 0; i < intA.length; i++){
                if (intA[i] > intB[i]) win++;
            }
        }catch (UserException2 ex){
            System.out.println(ex.getMessage());
        }
        return win;
    }

    class UserException2 extends Exception{
        public UserException2 (String mymsg){
            super(mymsg);
        }
    }

    private int[] arrayInt (char [] arChar) throws UserException2{
        int [] arInt = new int[arChar.length];
        for (int i = 0; i < arChar.length; i++){
            switch (arChar[i]){
                case 'A': arInt[i] = 14;break;
                case 'K': arInt[i] = 13;break;
                case 'Q': arInt[i] = 12;break;
                case 'J': arInt[i] = 11;break;
                case 'T': arInt[i] = 10;break;
                case '9': arInt[i] = 9;break;
                case '8': arInt[i] = 8;break;
                case '7': arInt[i] = 7;break;
                case '6': arInt[i] = 6;break;
                case '5': arInt[i] = 5;break;
                case '4': arInt[i] = 4;break;
                case '3': arInt[i] = 3;break;
                case '2': arInt[i] = 2;break;
                default: throw new UserException2("Invalid data");
            }
        }
        return arInt;
    }

    public static void main(String[] args) throws Exception{
        String A = "A586QA";
        String B = "JJ653K9";
        S1 s = new S1();

        System.out.println(s.solution(A,B));
    }
}
