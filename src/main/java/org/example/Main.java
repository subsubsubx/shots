package org.example;

import java.math.BigInteger;
import java.util.EnumSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<Grade> set = EnumSet.of(Grade.B, Grade.C, Grade.D);
        System.out.println(set.size());
    //    Utils.getShotInfo(Shots.SSB, 68);
    }

}