package org.example;


import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Shots {
    SSD(ShotType.SOULSHOT, Grade.D),
    BSSD(ShotType.BLESSED_SPIRITSHOT, Grade.D),
    SSC(ShotType.SOULSHOT, Grade.C),
    BSSC(ShotType.BLESSED_SPIRITSHOT, Grade.C),
    SSB(ShotType.SOULSHOT, Grade.B),
    BSSB(ShotType.BLESSED_SPIRITSHOT, Grade.B);

    private final ShotType shotType;
    private final Grade grade;

}
