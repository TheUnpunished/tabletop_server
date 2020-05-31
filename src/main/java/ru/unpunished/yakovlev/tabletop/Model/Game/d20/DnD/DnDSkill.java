package ru.unpunished.yakovlev.tabletop.Model.Game.d20.DnD;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.unpunished.yakovlev.tabletop.Model.Game.Effect;
import ru.unpunished.yakovlev.tabletop.UtilGame.DnD.DnDDistractionType;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.SequenceGenerator;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@SequenceGenerator(name = "idGenerator", sequenceName = "DnDSkill_seq", allocationSize=1)
@XmlAccessorType(XmlAccessType.FIELD)
public class DnDSkill extends Effect {

    private Integer value;
    private Boolean isProficient;
    private Double profMultiplier;
    @Enumerated(EnumType.STRING)
    private DnDDistractionType distractionType;


}
