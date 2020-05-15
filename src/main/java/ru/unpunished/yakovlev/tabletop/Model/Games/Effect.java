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
@SequenceGenerator(name = "idGenerator", sequenceName = "feature_seq", allocationSize=1)
public class Effect extends IdEntity {

    private String name;
    @Enumerated(EnumType.ORDINAL)
    private GameType gameType;
    @ManyToMany
    @JoinColumns(value = {@JoinColumn(referencedColumnName = "id")},
    foreignKey = @ForeignKey(name = "fk_effect_character"))
    private List<Character> affectedCharacters;
    //permanent = (duration < 0) or (duration = long.max)
    private Long duration;

}
