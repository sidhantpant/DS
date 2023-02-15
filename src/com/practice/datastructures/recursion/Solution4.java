package com.practice.datastructures.recursion;

public class Solution4 {


    public static String reverseString(String A){

        if(A == null || A.isEmpty()){
            return A;
        }
        return A.substring(A.length()-1) + reverseString(A.substring(0,A.length()-1));
    }

    public static void main(String[] args) {
        System.out.println("ldannkbrlkpnjhjkncuoxhweofyfmbdzslyqinpvsdoojkaplxvuaaafzdywaztyfitvbclpegwpkhqkjsracztrvtitgbzftlsttgudnbvubmdzoighgzfsdxmhsodtfacbymcpxolkdcoklfuotvjrolqcdwhimnkbrxwehvyyihjhdjfounwjqlljnljaxhgegkarhwgrdrpjdbkfmjampprrzmbimclbwqsrmngtaxygqntzkfmxobhoqrfhyklkhkdgrqkeslr"
                .equals(reverseString("ldannkbrlkpnjhjkncuoxhweofyfmbdzslyqinpvsdoojkaplxvuaaafzdywaztyfitvbclpegwpkhqkjsracztrvtitgbzftlsttgudnbvubmdzoighgzfsdxmhsodtfacbymcpxolkdcoklfuotvjrolqcdwhimnkbrxwehvyyihjhdjfounwjqlljnljaxhgegkarhwgrdrpjdbkfmjampprrzmbimclbwqsrmngtaxygqntzkfmxobhoqrfhyklkhkdgrqkeslr")));
        System.out.println(reverseString(("ldannkbrlkpnjhjkncuoxhweofyfmbdzslyqinpvsdoojkaplxvuaaafzdywaztyfitvbclpegwpkhqkjsracztrvtitgbzftlsttgudnbvubmdzoighgzfsdxmhsodtfacbymcpxolkdcoklfuotvjrolqcdwhimnkbrxwehvyyihjhdjfounwjqlljnljaxhgegkarhwgrdrpjdbkfmjampprrzmbimclbwqsrmngtaxygqntzkfmxobhoqrfhyklkhkdgrqkeslr")));
    }
}
