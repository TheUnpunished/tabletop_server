package ru.unpunished.yakovlev.tabletop.Model.Game.d20;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.unpunished.yakovlev.tabletop.Model.Game.Effect;
import ru.unpunished.yakovlev.tabletop.UtilGame.DnD.DnDDistractionType;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@XmlAccessorType(XmlAccessType.FIELD)
public class d20Ability extends Effect {

    private Integer ability_id;
    private Integer profMultiplier;
    private Integer value;
    @Enumerated(EnumType.STRING)
    private DnDDistractionType distractionType;

}
