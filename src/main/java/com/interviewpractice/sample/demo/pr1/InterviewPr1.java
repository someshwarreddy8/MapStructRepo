package com.interviewpractice.sample.demo.pr1;

public class InterviewPr1 {
    public static void main(String[] args) {
        sumOfDigitsInANumber();
    }


    private static void sumOfDigitsInANumber() {
        int no = 123;
        char[] charArray = String.valueOf(no).toCharArray();
        int sum = 0;
        for(char ch : charArray) {
            sum += Character.getNumericValue(ch);
        }
        System.out.println(sum);
    }

    //reverse number
    public static void reverseNumber() {
        int no = 15;
        String number = String.valueOf(no);

        StringBuilder reversedNumber = new StringBuilder(number);

//        for(int i=number.length()-1; i>=0; i--) {
//            reversedNumber.append(number.charAt(i));
//        }

        System.out.println(Integer.parseInt(reversedNumber.toString()));
        System.out.println(reversedNumber.reverse());
    }


    //swap Two Number without using 3rd variable.
    private static void swapTwoNumber() {
        int n1 = 10, n2 = 20;
        System.out.println("before swap: " + n1 + " " + n2);

        n1 = n1 + n2;
        n2 = n1 - n2;
        n1 = n1 - n2;

        System.out.println("after swap: " + n1 + " " + n2);
    }

    //Fibonacci
    private static void fibonacci(int number) {
        int n1 = 0, n2 = 1;

        System.out.print(n1 + " " + n2);
        for (int i = 2; i <= number; i++) {
            int sum = n1 + n2;
            System.out.print(" " + sum);
            n1 = n2;
            n2 = sum;
        }

    }

    //Prime Number Check
    private static String primeNumberCheck(int number) {

        if (number <= 1) {
            return "not a prime number";
        }

        boolean flag = true;
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                flag = false;
            }
        }

        return flag ? "Prime number" : "Not a prime number";
    }


    //Odd or Even check
    private static String oddEven(int number) {
//        if (number % 2 == 0) {
//            return "Even";
//        } else {
//            return "Odd";
//        }

        return number % 2 == 0 ? "Even" : "Odd";
    }
}
