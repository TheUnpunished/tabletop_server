package ru.unpunished.yakovlev.tabletop.Model.Game.d20.DnD;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.unpunished.yakovlev.tabletop.Model.Game.Effect;
import ru.unpunished.yakovlev.tabletop.UtilGame.DnD.DnDDistractionType;
import ru.unpunished.yakovlev.tabletop.UtilGame.DnD.DnDResistanceType;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class DnDResistance extends Effect {

    @Enumerated(EnumType.STRING)
    private DnDResistanceType resistanceType;
    @Enumerated(EnumType.STRING)
    private DnDDistractionType distractionType;

}
