package ru.unpunished.yakovlev.tabletop.Model.Games;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Enumerated;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Speed extends Effect {

    private String description;
    private Integer walkingSpeed;
    private Boolean walkingSpeedOverride;
    private Integer swimmingSpeed;
    private Boolean swimmingSpeedOverride;
    private Integer flyingSpeed;
    private Boolean flyingSpeedOverride;
    private Integer climbingSpeed;
    private Boolean climbingSpeedOverride;

}
