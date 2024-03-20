package org.example;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<Grade> set = EnumSet.of(Grade.B, Grade.C, Grade.D);
        System.out.println(Arrays.toString(set.toArray()));
        //feature qwe123
    }

}