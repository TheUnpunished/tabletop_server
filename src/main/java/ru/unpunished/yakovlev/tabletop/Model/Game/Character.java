package ru.unpunished.yakovlev.tabletop.Model.Game;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
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
    private Integer maxHealth;
    private Integer currentHealth;
    private Integer armorClass;
    private Integer weightCarry;
    private Boolean isPlayable;
    @OneToMany
    @JoinTable
    // 0 - left, 1 - right
    private List<Item> itemsInHands;
    @OneToMany
    @JoinTable
    private List<Item> inventory;
    @OneToMany
    @JoinTable
    private List<Language> languages;
    @ManyToOne
    @JoinColumns(value = {@JoinColumn(referencedColumnName = "id")},
            foreignKey = @ForeignKey(name = "fk_character_speed"))
    private Speed speed;
    @Enumerated(EnumType.ORDINAL)
    private GameType gameType;
    private Boolean isPublic;
    @ManyToOne
    @JoinColumns(value = {@JoinColumn(referencedColumnName = "id")},
            foreignKey = @ForeignKey(name = "fk_character_owner_profile"))
    private Profile owner;
    @ManyToMany
    @JoinColumns(value = {@JoinColumn(referencedColumnName = "id")},
    foreignKey = @ForeignKey(name = "fk_character_share"))
    private List<Profile> sharedWith;
    @ManyToOne
    @JoinColumns(value = {@JoinColumn(referencedColumnName = "id")},
    foreignKey = @ForeignKey(name = "fk_character_original"))
    private Character originalCharacter;

}
