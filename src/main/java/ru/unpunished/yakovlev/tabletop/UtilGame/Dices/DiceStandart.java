package ru.unpunished.yakovlev.tabletop.UtilGame.Dices;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Random;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class DiceStandart implements Dice{

    private Integer maxValue;
    private Random random;

    @Override
    public Integer throwDice() {
        Integer result = 1 + random.nextInt(maxValue);
        random.setSeed(System.currentTimeMillis());
        return result;
    }

    DiceStandart(Integer maxValue){
        this.maxValue = maxValue;
        this.random = new Random(System.currentTimeMillis());
    }

}
