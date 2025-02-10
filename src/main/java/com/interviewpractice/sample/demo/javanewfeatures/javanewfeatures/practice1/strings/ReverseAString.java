package com.interviewpractice.sample.demo.javanewfeatures.javanewfeatures.practice1.strings;

public class ReverseAString {
    public static void main(String[] args) {
        String s = "tomot";
        StringBuilder stringBuilder = new StringBuilder(s);
        stringBuilder.reverse();
        System.out.println(stringBuilder);

        StringBuilder sb = new StringBuilder();
        String s1= "";
        for (int i = s.length() - 1; i >= 0; i--) {
//            sb.append(s.charAt(i));
            s1 += s.charAt(i);
        }

//        System.out.println(s1.equals(s));


    }
}
