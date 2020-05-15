package ru.unpunished.yakovlev.tabletop.Model.Games.d20.DnD;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.unpunished.yakovlev.tabletop.Model.Games.d20.d20Character;

import javax.persistence.Entity;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class DnDCharacter extends d20Character {

    private Integer armorClass;
    private Integer initiative;
    private Integer profBonus;


}
