package ru.unpunished.yakovlev.tabletop.Model.Game.d20;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.unpunished.yakovlev.tabletop.Model.Game.Character;

import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
public class d20Character extends Character {

    @OneToMany
    @JoinTable
    private List<d20Ability> baseStats;


    public d20Ability getAbilityById(Integer id){
        for(d20Ability ability: baseStats){
            if(ability.getAbility_id() == id){
                return ability;
            }
        }
        return new d20Ability();
    }
}
