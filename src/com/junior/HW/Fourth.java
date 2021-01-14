package com.junior.HW;

public class Fourth {
    public static void main(String[] args) {

        String s1 = "This is just an example string for test", s2 = "";
        s2 = s2 + s1.substring(0, 1).toUpperCase(); //первый символ делаем заглавным
        for (int i = 1; i < s1.length(); i++) {
            // смотрим, был ли слева пробел:
            if (" ".equals(s1.substring(i-1, i)))
                s2 = s2 + s1.substring(i, i+1).toUpperCase();
            else
                s2 = s2 + s1.substring(i, i+1);
        }
        System.out.println(s1);
        System.out.println(s2);

    }
}
