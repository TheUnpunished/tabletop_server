package ru.unpunished.yakovlev.tabletop.Model.Games.d20.DnD;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.unpunished.yakovlev.tabletop.Model.Games.Effect;

import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@SequenceGenerator(name = "idGenerator", sequenceName = "DnDSkill_seq", allocationSize=1)
public class DnDSkill extends Effect {

    private Integer value;
    private Boolean isCustom;
    private Boolean isProficient;
    private Integer profMultiplier;

}
