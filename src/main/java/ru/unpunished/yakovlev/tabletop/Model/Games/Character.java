package ru.unpunished.yakovlev.tabletop.Model.Games;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.unpunished.yakovlev.tabletop.Model.IdEntity;
import ru.unpunished.yakovlev.tabletop.Model.Profile;
import ru.unpunished.yakovlev.tabletop.UtilGame.GameType;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@SequenceGenerator(name = "idGenerator", sequenceName = "character_seq", allocationSize=1)
public class Character extends IdEntity {

    private String name;
    private Long exp;
    private Integer lvl;
    private Integer maxHealth;
    private Integer currentHealth;
    @ManyToMany
    @JoinColumns(value = {@JoinColumn(referencedColumnName = "id")},
    foreignKey = "fk_")
    private List<Language> languages;
    @ManyToOne
    @JoinColumns(value = {@JoinColumn(referencedColumnName = "id")},
            foreignKey = @ForeignKey(name = "fk_character_speed"))
    private Speed speed;
    @Enumerated(EnumType.ORDINAL)
    private GameType gameType;
    private Boolean isPublic;
    @OneToOne
    @JoinColumns(value = {@JoinColumn(referencedColumnName = "id")},
            foreignKey = @ForeignKey(name = "fk_character_owner_profile"))
    private Profile owner;
    @ManyToMany
    @JoinColumns(value = {@JoinColumn(referencedColumnName = "id")},
    foreignKey = @ForeignKey(name = "fk_character_share"))
    private List<Profile> sharedWith;
    @ManyToOne
    @JoinColumns(value = {@JoinColumn(referencedColumnName = "original_id")},
    foreignKey = @ForeignKey(name = "fk_character_original"))
    private Character originalCharacter;

}
