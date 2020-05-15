package ru.unpunished.yakovlev.tabletop.Model.Games;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.unpunished.yakovlev.tabletop.Model.IdEntity;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@SequenceGenerator(name = "idGenerator", sequenceName = "background_seq", allocationSize=1)
public class Background extends IdEntity {

    private String name;
    private String introduction;
    @OneToMany
    @JoinColumns(value = {@JoinColumn(referencedColumnName = "id")},
            foreignKey = @ForeignKey(name = "fk_background_trait"))
    private List<Trait> traits;
    private Boolean isCustom;

}
