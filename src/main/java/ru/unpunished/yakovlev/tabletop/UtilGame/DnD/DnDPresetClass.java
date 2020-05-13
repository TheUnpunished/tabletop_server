package ru.unpunished.yakovlev.tabletop.UtilGame.DnD;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import ru.unpunished.yakovlev.tabletop.Model.DnDClass;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum DnDPresetClass {

    BARBARIAN(Integer.toUnsignedLong(0)),
    BARD(Integer.toUnsignedLong(1)),
    CLERIC(Integer.toUnsignedLong(2)),
    DRUID(Integer.toUnsignedLong(3)),
    FIGHTER(Integer.toUnsignedLong(4)),
    MONK(Integer.toUnsignedLong(5)),
    PALADIN(Integer.toUnsignedLong(6)),
    RANGER(Integer.toUnsignedLong(7)),
    ROGUE(Integer.toUnsignedLong(8)),
    SORCERER(Integer.toUnsignedLong(9)),
    WARLOCK(Integer.toUnsignedLong(10)),
    WIZARD(Integer.toUnsignedLong(11));

    private DnDClass dnDClass;

    DnDPresetClass(Long id){

    }
}
