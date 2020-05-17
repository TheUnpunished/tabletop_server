package ru.unpunished.yakovlev.tabletop.Model.Game;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.unpunished.yakovlev.tabletop.Model.IdEntity;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@SequenceGenerator(name = "idGenerator", sequenceName = "background_seq", allocationSize=1)
@XmlAccessorType(XmlAccessType.FIELD)
public class Background extends IdEntity {

    private String name;
    private String introduction;
    @JoinTable
    @OneToMany
    private List<Trait> traits;
    private Boolean isCustom;

}
