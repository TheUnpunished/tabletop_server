package ru.unpunished.yakovlev.tabletop.Model.Game.d20.DnD;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.unpunished.yakovlev.tabletop.Model.Game.d20.d20Character;
import ru.unpunished.yakovlev.tabletop.UtilGame.DnD.DnDHealthMechanic;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@XmlAccessorType(XmlAccessType.FIELD)
public class DnDCharacter extends d20Character {

    private Boolean inspiration;
    @ManyToOne
    private DnDClass dnDClass;
    @ManyToOne
    private DnDBackground background;
    @Enumerated(EnumType.STRING)
    private DnDHealthMechanic healthMechanic;

}
