package ru.unpunished.yakovlev.tabletop.Model.Games;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.unpunished.yakovlev.tabletop.Model.IdEntity;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@SequenceGenerator(name = "idGenerator", sequenceName = "gameclass_seq", allocationSize=1)
public class GameClass extends IdEntity {

    private String name;
    private String description;
    @ManyToMany
    @JoinColumns(value = {@JoinColumn(referencedColumnName = "id")},
            foreignKey = @ForeignKey(name = "fk_class_trait"))
    private List<Trait> traits;

}
