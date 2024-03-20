package org.example;


import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Grade {
    D(591),
    C(1560),
    B(11265),
    A(9999),
    S(99999);

    private final double cryPrice;

}
