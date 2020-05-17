package ru.unpunished.yakovlev.tabletop.Model.Game;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@XmlAccessorType(XmlAccessType.FIELD)
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
