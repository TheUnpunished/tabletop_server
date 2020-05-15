package ru.unpunished.yakovlev.tabletop.Model.Games;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.unpunished.yakovlev.tabletop.Model.IdEntity;
import ru.unpunished.yakovlev.tabletop.UtilGame.GameType;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@SequenceGenerator(name = "idGenerator", sequenceName = "trait_seq", allocationSize=1)
public class Trait extends IdEntity {

    private String name;
    private String description;
    @Enumerated(EnumType.ORDINAL)
    private GameType gameType;
    private Boolean isCustom;
    @OneToMany
    @JoinTable
    private List<Effect> effects;

}
