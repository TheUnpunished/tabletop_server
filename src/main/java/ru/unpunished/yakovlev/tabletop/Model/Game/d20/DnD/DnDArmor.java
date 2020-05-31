package ru.unpunished.yakovlev.tabletop.Model.Game.d20.DnD;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.jmx.export.annotation.ManagedAttribute;
import ru.unpunished.yakovlev.tabletop.Model.Game.ArmorEffect;
import ru.unpunished.yakovlev.tabletop.Model.Game.Item;
import ru.unpunished.yakovlev.tabletop.UtilGame.DnD.DnDArmorType;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.persistence.criteria.CriteriaBuilder;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@XmlAccessorType(XmlAccessType.FIELD)
public class DnDArmor extends Item {

    @Enumerated(EnumType.STRING)
    private DnDArmorType armorType;
    @ManyToOne
    private ArmorEffect armorEffect;
    // override
    private Boolean heavy;
    private Integer strRequire;

}
