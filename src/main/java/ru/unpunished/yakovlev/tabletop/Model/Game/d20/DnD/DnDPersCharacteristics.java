package ru.unpunished.yakovlev.tabletop.Model.Game.d20.DnD;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.unpunished.yakovlev.tabletop.Model.IdEntity;

import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@SequenceGenerator(name = "idGenerator", sequenceName = "DnDPersCharacteristics_seq", allocationSize=1)
@XmlAccessorType(XmlAccessType.FIELD)
public class DnDPersCharacteristics extends IdEntity {

    private String personalityTraits;
    private String ideals;
    private String bonds;
    private String flaws;

}
