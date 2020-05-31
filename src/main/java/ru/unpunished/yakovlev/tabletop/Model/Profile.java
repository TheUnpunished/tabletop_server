package ru.unpunished.yakovlev.tabletop.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.unpunished.yakovlev.tabletop.Model.Game.Character;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import java.sql.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@XmlAccessorType(XmlAccessType.FIELD)
public class Profile extends TabletopUser {

    private String nickname;
    private String email;
    private Date dateBirth;

}
