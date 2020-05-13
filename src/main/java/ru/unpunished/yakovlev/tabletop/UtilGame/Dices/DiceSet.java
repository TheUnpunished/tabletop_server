package ru.unpunished.yakovlev.tabletop.UtilGame.Dices;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public enum  DiceSet {

    D4(new DiceStandart(4)),
    D6(new DiceStandart(6)),
    D8(new DiceStandart(8)),
    D10(new DiceStandart(10)),
    D12(new DiceStandart(12)),
    D20(new DiceStandart(20)),
    D100(new Dice100());

    private Dice dice;

}
