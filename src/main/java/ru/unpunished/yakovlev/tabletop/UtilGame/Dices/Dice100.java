package ru.unpunished.yakovlev.tabletop.UtilGame.Dices;

import java.util.Random;

public class Dice100 implements Dice {

    private Random random;

    @Override
    public Integer throwDice() {
        Integer firstNumber = 0 + random.nextInt(10);
        random.setSeed(System.currentTimeMillis());
        Integer secondNumber = 0 + random.nextInt(10);
        random.setSeed(System.currentTimeMillis());
        if((firstNumber + secondNumber) == 0){
            return 100;
        }
        else {
            return firstNumber + (secondNumber * 10);
        }
    }

    Dice100(){
        this.random = new Random(System.currentTimeMillis());
    }
}
