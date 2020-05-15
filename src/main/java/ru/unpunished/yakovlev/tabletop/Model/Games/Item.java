package ru.unpunished.yakovlev.tabletop.Model.Games;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.unpunished.yakovlev.tabletop.UtilGame.GameType;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Item extends Effect {

    @Enumerated(EnumType.ORDINAL)
    private GameType gameType;
    private String description;
    private Integer weight;
    private Integer price;
    @OneToMany
    @JoinColumns(value = {@JoinColumn(referencedColumnName = "id")},
    foreignKey = @ForeignKey(name = "fk_item_feature"))
    private List<Effect> itemEffects;

}
