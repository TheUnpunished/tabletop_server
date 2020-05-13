package ru.unpunished.yakovlev.tabletop.UtilGame.DnD;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import ru.unpunished.yakovlev.tabletop.Model.DnDBackground;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public enum DnDPresetBackground {

    ACOLYTE(Integer.toUnsignedLong(0)),
    CRIMINALSPY(Integer.toUnsignedLong(1)),
    FOLKHERO(Integer.toUnsignedLong(2)),
    HAUNTEDONE(Integer.toUnsignedLong(3)),
    NOBLE(Integer.toUnsignedLong(4)),
    SAGE(Integer.toUnsignedLong(5)),
    SOLDIER(Integer.toUnsignedLong(6));

    private DnDBackground background;

    DnDPresetBackground(Long id){

    }

}
