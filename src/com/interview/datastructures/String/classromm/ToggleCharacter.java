package com.interview.datastructures.String.classromm;

public class ToggleCharacter {

    public static void main(String[] args) {
        String str = "tOmaTo";
        ToggleCharacter tc = new ToggleCharacter();
        tc.toggleCharacter(str);
        tc.toggleCharacterOpt(str);
    }

    public void toggleCharacter(String str) {
        char[] ch = str.toCharArray();
        int N = str.length();
        for (int i = 0; i < N; i++) {
            if (ch[i] >= 65 && ch[i] <= 90) {
                ch[i] = (char) (ch[i] + 32);
            } else {
                ch[i] = (char) (ch[i] - 32);
            }
        }
        System.out.println(ch);
    }

    public void toggleCharacterOpt(String str) {
        char[] ch = str.toCharArray();
        int N = str.length();
        for (int i = 0; i < N; i++) {
//            ch[i] = (char) (ch[i] ^ ( 1<<5));
            ch[i] = (char) (ch[i] ^ 32);
        }
        System.out.println(ch);
    }

}
