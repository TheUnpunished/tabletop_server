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
@SequenceGenerator(name = "idGenerator", sequenceName = "DnDNotes_seq", allocationSize=1)
public class DnDNotes extends IdEntity {

    private String organizations;
    private String allies;
    private String enemies;
    private String backstory;
    private String other;

}
