package ru.unpunished.yakovlev.tabletop.Model.Game.d20.DnD;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.unpunished.yakovlev.tabletop.Model.Game.GameClass;
import ru.unpunished.yakovlev.tabletop.Model.Game.Trait;
import ru.unpunished.yakovlev.tabletop.Model.Game.TraitChoice;
import ru.unpunished.yakovlev.tabletop.UtilGame.Dices.PresetDice;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DnDClass extends GameClass {

    @Enumerated(EnumType.STRING)
    private PresetDice healthDice;
    private Integer healthBonus;
    @JoinTable
    @OneToMany
    private List<DnDFeat> feats;
    @JoinTable
    @OneToMany
    private List<TraitChoice> traitChoices;
    @JoinTable
    @OneToMany
    private List<Trait> traits;

}
