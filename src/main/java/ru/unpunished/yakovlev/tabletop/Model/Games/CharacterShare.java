package ru.unpunished.yakovlev.tabletop.Model.Games;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.unpunished.yakovlev.tabletop.Model.IdEntity;
import ru.unpunished.yakovlev.tabletop.Model.Profile;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@SequenceGenerator(name = "idGenerator", sequenceName = "charactershare_seq", allocationSize=1)
public class CharacterShare extends IdEntity {

    @ManyToOne
    @JoinColumns(value = {@JoinColumn(referencedColumnName = "id")},
    foreignKey = @ForeignKey(name = "fk_charactershare_charatcer"))
    private Character character;
    @ManyToMany
    @JoinColumns(value = {@JoinColumn(referencedColumnName = "id")},
    foreignKey = @ForeignKey(name = "fk_charactershare_profile"))
    private List<Profile> sharedWith;


}
