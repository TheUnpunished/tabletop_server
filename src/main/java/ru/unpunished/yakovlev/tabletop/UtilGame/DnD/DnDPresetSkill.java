package ru.unpunished.yakovlev.tabletop.UtilGame.DnD;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import ru.unpunished.yakovlev.tabletop.Model.Game.d20.DnD.DnDSkill;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public enum DnDPresetSkill {

    ACROBATICS(Integer.toUnsignedLong(0)),
    ANIMALHANDLING(Integer.toUnsignedLong(1)),
    ARCANA(Integer.toUnsignedLong(2)),
    ATHLETICS(Integer.toUnsignedLong(3)),
    DECEPTION(Integer.toUnsignedLong(4)),
    HISTORY(Integer.toUnsignedLong(5)),
    INSIGHT(Integer.toUnsignedLong(6)),
    INTIMIDATION(Integer.toUnsignedLong(7)),
    INVESTIGATION(Integer.toUnsignedLong(8)),
    MEDICINE(Integer.toUnsignedLong(9)),
    NATURE(Integer.toUnsignedLong(10)),
    PERCEPTION(Integer.toUnsignedLong(11)),
    PERFORMANCE(Integer.toUnsignedLong(12)),
    PERSUATION(Integer.toUnsignedLong(13)),
    RELIGION(Integer.toUnsignedLong(14)),
    SLEIGHTOFHAND(Integer.toUnsignedLong(15)),
    STEALTH(Integer.toUnsignedLong(16)),
    SURVIVAL(Integer.toUnsignedLong(17));

    private DnDSkill skill;

    DnDPresetSkill (Long id){

    }

}
