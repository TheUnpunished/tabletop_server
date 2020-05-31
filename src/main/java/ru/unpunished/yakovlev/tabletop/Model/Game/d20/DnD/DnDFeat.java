package ru.unpunished.yakovlev.tabletop.Model.Game.d20.DnD;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.unpunished.yakovlev.tabletop.Model.Game.Character;
import ru.unpunished.yakovlev.tabletop.Model.Game.Effect;
import ru.unpunished.yakovlev.tabletop.Model.Game.GameClass;
import ru.unpunished.yakovlev.tabletop.Model.Game.Trait;
import ru.unpunished.yakovlev.tabletop.Model.IdEntity;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@SequenceGenerator(name = "idGenerator", sequenceName = "DnDFeat_seq", allocationSize=1)
@XmlAccessorType(XmlAccessType.FIELD)
public class DnDFeat extends IdEntity {

    private String name;
    private String description;
    @JoinTable
    @OneToMany
    private List<Trait> traits;


}
