package ru.unpunished.yakovlev.tabletop.Model.Games.d20.DnD;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.unpunished.yakovlev.tabletop.Model.Games.Background;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class DnDBackground extends Background {

    private String featureName;
    private String featureDescription;
    @ManyToOne
    @JoinColumns(value = {@JoinColumn(referencedColumnName = "id")},
    foreignKey = @ForeignKey(name = "fk_DnDBackground_DnDPhysCharacteristics"))
    private DnDPhysCharacteristics physCharacteristics;
    @ManyToOne
    @JoinColumns(value = {@JoinColumn(referencedColumnName = "id")},
    foreignKey = @ForeignKey(name = "fk_DnDBackground_DnDPersCharacteristics"))
    private DnDPersCharacteristics persCharacteristics;
    @ManyToOne
    @JoinColumns(value = {@JoinColumn(referencedColumnName = "id")},
            foreignKey = @ForeignKey(name = "fk_DnDBackground_DnDNotes"))
    private DnDNotes notes;

}
