package ru.unpunished.yakovlev.tabletop.UtilGame.DnD;

import lombok.NoArgsConstructor;
import ru.unpunished.yakovlev.tabletop.Model.DnDCharacter;

@NoArgsConstructor
public class DnDProficiencyBonusResolver {

    public Integer resolveProficiencyForLevel(Integer level){
        return 2 + ((level - 1) / 4);
    }

    public void resolveCharacterProficiency(DnDCharacter character){
        character.setProfBonus(resolveProficiencyForLevel(character.getLvl()));
    }
}
