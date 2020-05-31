package ru.unpunished.yakovlev.tabletop.UtilGame.DnD;

import lombok.NoArgsConstructor;
import ru.unpunished.yakovlev.tabletop.Model.Game.Character;
import ru.unpunished.yakovlev.tabletop.Model.Game.d20.DnD.DnDCharacter;

@NoArgsConstructor
public class DnDResolver {

    public Integer resolveModifierForStat(Integer statValue, Boolean character){

        if(statValue < 0){
            return resolveModifierForStat(0, true);
        }

        if(statValue > 20){
            if (character){
                return resolveModifierForStat(20, true);
            }
            else {
                if(statValue > 30){
                    return resolveModifierForStat(30, false);
                }
            }

        }
        
        if(statValue < 10){
            return (statValue - 11) / 2;
        }
        else {
            return (statValue - 10) / 2;
        }
    }

    public Integer resolveProficiency(Integer level){
        return 2 + ((level - 1) / 4);
    }

    public Integer resolveProficiency(Character character){
        return 2 + ((character.getLvl() - 1) / 4);
    }

    public void increaseHealth(DnDCharacter character){
        switch (character.getHealthMechanic()){
            case FIXED:{
                character.setMaxHealth(character.getMaxHealth() +
                        character.getDnDClass().getHealthBonus());
                character.setMaxHealth(character.getMaxHealth() +
                        resolveModifierForStat(
                                character.getAbilityById(DnDStat.CONSTITUTION.getId()).getValue(), true)
                );
                break;
            }
            case RANDOM:
                character.setMaxHealth(character.getMaxHealth() +
                        character.getDnDClass().getHealthDice().getDice().throwDice());
                character.setMaxHealth(character.getMaxHealth() +
                        resolveModifierForStat(
                                character.getAbilityById(DnDStat.CONSTITUTION.getId()).getValue(), true)
                );
                break;
        }
    }


}
