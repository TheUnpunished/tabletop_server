package ru.unpunished.yakovlev.tabletop.Model.Game;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@SequenceGenerator(name = "idGenerator", sequenceName = "weapon_seq", allocationSize=1)
@XmlAccessorType(XmlAccessType.FIELD)
public class Weapon extends Item {

    @OneToMany
    @JoinTable
    private List<Damage> damage;
    private Integer efficientRange;
    private Integer maxRange;
    @ManyToOne
    @JoinColumns(value = {@JoinColumn(referencedColumnName = "id")},
    foreignKey = @ForeignKey(name = "fk_weapon_item"))
    private Item usesAmmo;
    private Boolean is2H;

}
