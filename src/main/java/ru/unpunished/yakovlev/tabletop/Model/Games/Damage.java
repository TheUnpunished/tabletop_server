package ru.unpunished.yakovlev.tabletop.Model.Games;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.unpunished.yakovlev.tabletop.UtilGame.DamageType;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Damage extends Effect {

    private Integer value;
    private Integer swings;
    private String description;
    @Enumerated(EnumType.STRING)
    private DamageType damageType;

}
