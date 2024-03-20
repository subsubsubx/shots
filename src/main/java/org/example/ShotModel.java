package org.example;

public class ShotModel {
    private final int orePrice;
    private double manaCost;
    private double shotsPerClick;
    private int oreQuantity;
    private int cryQuantity;

    public ShotModel(Shots shots) {
        switch (shots.getShotType()) {
            case SOULSHOT -> {
                orePrice = 312;
                setSoulshotValues(shots);
            }
            case BLESSED_SPIRITSHOT -> {
                orePrice = 500;
                setBlessedSpiritshotValues(shots);
            }
            default -> throw new RuntimeException("wrong type: " + shots.getShotType());
        }
    }

    private void setBlessedSpiritshotValues(Shots shots) {
        switch (shots.getGrade()) {
            case D -> {
                oreQuantity = 18;
                cryQuantity = 2;
                manaCost = 60;
                shotsPerClick = 100;
            }
            case C -> {
                oreQuantity = 30;
                cryQuantity = 2;
                manaCost = 120;
                shotsPerClick = 200;
            }
            case B -> {
                oreQuantity = 16;
                cryQuantity = 2;
                manaCost = 180;
                shotsPerClick = 100;
            }
        }
    }

    private void setSoulshotValues(Shots shots) {
        switch (shots.getGrade()) {
            case D -> {
                oreQuantity = 9;
                cryQuantity = 3;
                manaCost = 72;
                shotsPerClick = 468;
            }
            case C -> {
                oreQuantity = 30;
                cryQuantity = 2;
                manaCost = 84;
                shotsPerClick = 952;
            }
            case B -> {
                oreQuantity = 54;
                cryQuantity = 1;
                manaCost = 100;
                shotsPerClick = 450;
            }
        }
    }

    private double getTotalCost(Shots shots) {
        return orePrice * oreQuantity +
                shots.getGrade().getCryPrice() * cryQuantity;
    }

    double getPricePerShot(Shots shots) {
        return getTotalCost(shots) / shotsPerClick;
    }

    double getPricePerMana(Shots shots, int sellPrice) {
        return ((shotsPerClick * sellPrice) - getTotalCost(shots)) / manaCost;

    }
}
