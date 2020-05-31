package ru.unpunished.yakovlev.tabletop.UtilGame.DnD;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum DnDResistanceType {

    NONE(1.0),
    RESISTANT(0.5),
    WEAK(2.0);

    private Double multiplier;

}
