package com.interview.datastructures.String.classromm;

public class WordByWordReverse {
    public void stupidApproach(String str) {

        String[] s = str.split("_");
        int N = s.length;
        String a = "";
        for (int i = 0; i < N; i++) {
            if (i == N - 1) {
                a = a + s[N - 1 - i];
            } else {
                a = a + s[N - 1 - i].concat("_");
            }
            System.out.println(a);
        }
    }

    public void wordByWordReverse(String str) {
        char[] ch = str.toCharArray();
        int N = ch.length;
        int p1 = 0;
        int p2 = 0;
        reverse(ch, 0, N - 1);
        while (p2 < N) {
            if (ch[p2] == '_') {
                reverse(ch, p1, p2 - 1);
                p1 = p2 + 1;
            }
            p2++;
        }
        reverse(ch,p1,N-1);
        System.out.println(ch);
    }

    public void reverse(char[] ch, int s, int e) {

        while (s < e) {
            swap(ch, s, e);
            s++;
            e--;
        }
    }

    public void swap(char[] ch, int s, int e) {
        char temp = ch[s];
        ch[s] = ch[e];
        ch[e] = temp;
    }

    public static void main(String[] args) {
        WordByWordReverse word = new WordByWordReverse();
//        word.stupidApproach("love_hate_data_structure");
        word.wordByWordReverse("love_marry_kill");
    }


}
