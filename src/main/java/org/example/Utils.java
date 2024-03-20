package org.example;

public class Utils {

    public static void getShotInfo(Shots shot, int... sellPrice) {
        ShotModel shotModel = new ShotModel(shot);
        for (int i : sellPrice) {
            System.out.printf(shot.getShotType() + " " + shot.getGrade() + ": %1.2f" +
                            " adena per shot, %1.2f adena per mana - sell price " +
                            i + "\n", shotModel.getPricePerShot(shot), shotModel.getPricePerMana(shot, i));
        }
    }
}
