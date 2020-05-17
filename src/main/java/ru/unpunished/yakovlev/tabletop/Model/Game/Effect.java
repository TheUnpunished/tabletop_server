package ru.unpunished.yakovlev.tabletop.Model.Game;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.unpunished.yakovlev.tabletop.Model.IdEntity;
import ru.unpunished.yakovlev.tabletop.UtilGame.DistractionType;
import ru.unpunished.yakovlev.tabletop.UtilGame.GameType;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@SequenceGenerator(name = "idGenerator", sequenceName = "feature_seq", allocationSize=1)
@XmlAccessorType(XmlAccessType.FIELD)
public class Effect extends IdEntity {

    private String name;
    @Enumerated(EnumType.ORDINAL)
    private GameType gameType;
    //permanent = (duration < 0) or (duration = long.max)
    private Long duration;
    private Boolean isCustom;
    private Boolean isOriginal;
    private DistractionType distractionType;

}
