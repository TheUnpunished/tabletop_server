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
@SequenceGenerator(name = "idGenerator", sequenceName = "DnDPersCharacteristics_seq", allocationSize=1)
public class DnDPersCharacteristics extends IdEntity {

    private String personalityTraits;
    private String ideals;
    private String bonds;
    private String flaws;

}
