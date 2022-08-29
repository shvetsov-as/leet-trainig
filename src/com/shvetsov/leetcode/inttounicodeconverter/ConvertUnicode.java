package com.shvetsov.leetcode.inttounicodeconverter;

public class ConvertUnicode {

    public static char charExpression(int a) {

        char startChar = '\\';
        int codeStartChar = startChar;
        int codeResultChar = codeStartChar + a;

        if (codeResultChar < 0) {
            codeResultChar += 65535;
        }

        char resultChar = Character.toChars(codeResultChar)[0];
        return resultChar;
    }

}
