package ru.unpunished.yakovlev.tabletop.Model.Games;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Spell extends Effect {

    private String description;
    @OneToMany
    @JoinColumns(value = {@JoinColumn(referencedColumnName = "id")},
            foreignKey = @ForeignKey(name = "fk_spell_effect"))
    private List<Effect> effects;

}
