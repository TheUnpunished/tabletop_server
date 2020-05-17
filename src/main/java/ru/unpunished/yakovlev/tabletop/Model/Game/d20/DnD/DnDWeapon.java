package ru.unpunished.yakovlev.tabletop.Model.Game.d20.DnD;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.unpunished.yakovlev.tabletop.Model.Game.Weapon;
import ru.unpunished.yakovlev.tabletop.UtilGame.DnD.DnDWeaponClass;
import ru.unpunished.yakovlev.tabletop.UtilGame.DnD.DnDWeaponType;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@XmlAccessorType(XmlAccessType.FIELD)
public class DnDWeapon extends Weapon {

    @Enumerated(EnumType.STRING)
    private DnDWeaponClass dnDWeaponClass;
    @Enumerated(EnumType.STRING)
    private DnDWeaponType dnDWeaponType;

}
