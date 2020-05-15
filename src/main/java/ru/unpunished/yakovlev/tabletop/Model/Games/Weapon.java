package ru.unpunished.yakovlev.tabletop.Model.Games;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@SequenceGenerator(name = "idGenerator", sequenceName = "weapon_seq", allocationSize=1)
public class Weapon extends Item {

    @OneToMany
    private List<Damage> damage;

}
