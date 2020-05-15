package ru.unpunished.yakovlev.tabletop.Model.Games.d20.DnD;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.unpunished.yakovlev.tabletop.Model.IdEntity;

import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@SequenceGenerator(name = "idGenerator", sequenceName = "DnDPhysCharacteristics_seq", allocationSize=1)
public class DnDPhysCharacteristics extends IdEntity {

    private String hairDescription;
    private String skinDescription;
    private String eyesDescription;
    private String heightDescription;
    private String weightDescription;
    private Long age;
    private String genderDescription;

}
