package ru.unpunished.yakovlev.tabletop.Model.Game;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;
import ru.unpunished.yakovlev.tabletop.Model.IdEntity;
import ru.unpunished.yakovlev.tabletop.Model.Profile;
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
@SequenceGenerator(name = "idGenerator", sequenceName = "character_seq", allocationSize=1)
@XmlAccessorType(XmlAccessType.FIELD)
public class Character extends IdEntity {

    private String name;
    private Long exp;
    private Integer lvl;
    private Integer currentHealth;
    private Integer maxHealth;
    private Boolean isPlayable;
    @ManyToOne
    @JoinColumns(value = {@JoinColumn(referencedColumnName = "id")},
            foreignKey = @ForeignKey(name = "fk_character_speed"))
    private Speed speed;
    @Enumerated(EnumType.STRING)
    private GameType gameType;
    @ManyToOne
    @JoinColumns(value = {@JoinColumn(referencedColumnName = "id")},
            foreignKey = @ForeignKey(name = "fk_character_owner_profile"))
    private Profile owner;
    @OneToMany
    @JoinTable
    private List<Effect> effects;
    private Boolean isOriginal;

    public void addEffect(List<Effect> effects){
        this.effects.addAll(effects);
    }

    public void addEffect(Effect effect){
        this.effects.add(effect);
    }

    public void addFromTrait(Trait trait){
        this.effects.addAll(trait.getEffects());
    }


}
