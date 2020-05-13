package ru.unpunished.yakovlev.tabletop.UtilGame.Dices;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class DiceThrower {

    private List<Dice> dices;

    public Integer getSum(){
        Integer sum = 0;
        for (Dice dice: dices){
            sum += dice.throwDice();
        }
        return sum;
    }

    public void addDice(Dice dice){
        dices.add(dice);
    }

    public void addDices(List<Dice> diceSet){
        dices.addAll(diceSet);
    }

    public void resetDices(){
        dices.clear();
    }


    public Integer getSumBest(Integer amount){
        List<Integer> results = new ArrayList<>();
        for (Dice dice: dices){
            results.add(dice.throwDice());
        }
        List<Integer> best = new ArrayList<>();
        for (int i=0; i < amount; i++){
            best.add(results.get(i));
        }
        for (int i=amount; i < results.size(); i++){
            Integer smallest = Integer.MAX_VALUE;
            Integer j_smallest = 0;
            for(int j = 0; j < best.size(); j++){
                if(best.get(j) < smallest){
                    smallest = best.get(j);
                    j_smallest = j;
                }
            }
            if (results.get(i) > smallest){
                best.set(j_smallest, results.get(i));
            }
        }
        Integer result = 0;
        for(Integer value: best){
            result += value;
        }
        return result;
    }

    public Integer getSumWorst(Integer amount){
        List<Integer> results = new ArrayList<>();
        for (Dice dice: dices){
            results.add(dice.throwDice());
        }
        List<Integer> best = new ArrayList<>();
        for (int i=0; i < amount; i++){
            best.add(results.get(i));
        }
        for (int i=amount; i < results.size(); i++){
            Integer biggest = 0;
            Integer j_biggest = 0;
            for(int j = 0; j < best.size(); j++){
                if(best.get(j) > biggest){
                    biggest = best.get(j);
                    j_biggest = j;
                }
            }
            if (results.get(i) < biggest){
                best.set(j_biggest, results.get(i));
            }
        }
        Integer result = 0;
        for(Integer value: best){
            result += value;
        }
        return result;
    }

}
