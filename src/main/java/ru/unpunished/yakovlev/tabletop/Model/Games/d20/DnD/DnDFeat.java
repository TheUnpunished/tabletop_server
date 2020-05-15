package ru.unpunished.yakovlev.tabletop.Model.Games.d20.DnD;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.unpunished.yakovlev.tabletop.Model.Games.Character;
import ru.unpunished.yakovlev.tabletop.Model.Games.Effect;
import ru.unpunished.yakovlev.tabletop.Model.Games.GameClass;
import ru.unpunished.yakovlev.tabletop.Model.IdEntity;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class DnDFeat extends IdEntity {

    @ManyToOne
    @JoinColumns(value = {@JoinColumn(referencedColumnName = "id")},
    foreignKey = @ForeignKey(name = "fk_feat_character"))
    private Character characterChoice;
    @ManyToOne
    @JoinColumns(value = {@JoinColumn(referencedColumnName = "id")},
    foreignKey = @ForeignKey(name = "fk_feat_class"))
    private GameClass reqClass;
    private Integer reqLvl;
    @OneToMany
    @JoinColumns(value = {@JoinColumn(referencedColumnName = "id")},
            foreignKey = @ForeignKey(name = "fk_feat_effect"))
    private List<Effect> effects;


}
