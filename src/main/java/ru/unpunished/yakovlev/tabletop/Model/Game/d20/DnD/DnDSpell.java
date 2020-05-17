package ru.unpunished.yakovlev.tabletop.Model.Game.d20.DnD;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.unpunished.yakovlev.tabletop.Model.Game.Item;
import ru.unpunished.yakovlev.tabletop.Model.Game.Spell;
import ru.unpunished.yakovlev.tabletop.UtilGame.DnD.DnDSpellArea;
import ru.unpunished.yakovlev.tabletop.UtilGame.DnD.DnDSpellSchool;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@XmlAccessorType(XmlAccessType.FIELD)
public class DnDSpell extends Spell {

    private Integer spellLvL;
    private Boolean isKnown;
    private Boolean isInSpellBook;
    private Integer timeToPrepare;
    private Boolean isVerbal;
    private Boolean isSomatical;
    private Boolean isConcentratable;
    @ManyToOne
    @JoinColumns(value = {@JoinColumn(referencedColumnName = "id")},
    foreignKey = @ForeignKey(name = "fk_DnDSpell_reqIten"))
    private Item reqItem;
    @Enumerated(EnumType.STRING)
    private DnDSpellSchool dnDSpellSchool;
    @Enumerated
    private DnDSpellArea dnDSpellArea;

}
