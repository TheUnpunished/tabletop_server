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
@SequenceGenerator(name = "idGenerator", sequenceName = "DnDPhysCharacteristics_seq", allocationSize=1)
@XmlAccessorType(XmlAccessType.FIELD)
public class DnDPhysCharacteristics extends IdEntity {

    private String hairDescription;
    private String skinDescription;
    private String eyesDescription;
    private String heightDescription;
    private String weightDescription;
    private Long age;
    private String genderDescription;

}
