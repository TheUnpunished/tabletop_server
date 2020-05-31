package ru.unpunished.yakovlev.tabletop.Model.Game;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.unpunished.yakovlev.tabletop.Model.IdEntity;
import ru.unpunished.yakovlev.tabletop.UtilGame.EffectSource;
import ru.unpunished.yakovlev.tabletop.UtilGame.GameType;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@SequenceGenerator(name = "idGenerator", sequenceName = "trait_seq", allocationSize=1)
@XmlAccessorType(XmlAccessType.FIELD)
public class Trait extends IdEntity {

    private String name;
    private String description;
    private Integer reqLvl = 0;
    @Enumerated(EnumType.STRING)
    private GameType gameType;
    @Enumerated(EnumType.STRING)
    private EffectSource source;
    private Boolean isCustom;
    @OneToMany
    @JoinTable
    private List<Effect> effects;

}
