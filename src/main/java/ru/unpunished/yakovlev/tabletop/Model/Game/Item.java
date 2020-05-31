package ru.unpunished.yakovlev.tabletop.Model.Game;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
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
@XmlAccessorType(XmlAccessType.FIELD)
public class Item extends Effect {

    @Enumerated(EnumType.ORDINAL)
    private GameType gameType;
    private String description;
    private Integer count;
    private Integer weight;
    private Integer price;
    private Boolean equipped;
    @OneToMany
    @JoinTable
    private List<Effect> itemEffects;

}
