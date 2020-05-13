package ru.unpunished.yakovlev.tabletop.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.unpunished.yakovlev.tabletop.UtilGame.DnD.DnDPresetRace;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DnDCharacter extends d20Character {

    private DnDPresetRace race;
    private Integer speed;
    private DnDClass dnDClass;
    private Integer armorClass;
    private Integer initiative;
    private Integer profBonus;

}
