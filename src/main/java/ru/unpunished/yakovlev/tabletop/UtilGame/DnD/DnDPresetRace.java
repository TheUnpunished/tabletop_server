package ru.unpunished.yakovlev.tabletop.UtilGame.DnD;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import ru.unpunished.yakovlev.tabletop.Model.Games.Race;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum DnDPresetRace {

    DRAGONBORN(Integer.toUnsignedLong(0)),
    HILLDWARF(Integer.toUnsignedLong(1)),
    MOUNTAINDWARF(Integer.toUnsignedLong(2)),
    ELADRINELF(Integer.toUnsignedLong(3)),
    HIGHELF(Integer.toUnsignedLong(4)),
    WOODELF(Integer.toUnsignedLong(5)),
    HALFELF(Integer.toUnsignedLong(6)),
    HALFORC(Integer.toUnsignedLong(7)),
    LIGHTFOOTHALFLING(Integer.toUnsignedLong(8)),
    STOUTHALFLING(Integer.toUnsignedLong(9)),
    HUMAN(Integer.toUnsignedLong(10)),
    VARIANTHUMAN(Integer.toUnsignedLong(11)),
    GNOME(Integer.toUnsignedLong(12)),
    TIEFLING(Integer.toUnsignedLong(13)),
    AASIMAR(Integer.toUnsignedLong(14));

    private Race race;

    DnDPresetRace(Long id){

    }

}
