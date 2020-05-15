package ru.unpunished.yakovlev.tabletop.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.unpunished.yakovlev.tabletop.Model.Games.Character;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Profile extends TabletopUser {

    private String nickname;
    @OneToMany(mappedBy = "owner")
    private List<Character> characters;

}
