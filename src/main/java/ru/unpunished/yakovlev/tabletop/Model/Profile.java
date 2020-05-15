package ru.unpunished.yakovlev.tabletop.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.unpunished.yakovlev.tabletop.Model.Games.Character;

import javax.persistence.Entity;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Profile extends User {

    private String nickname;
    private List<Character> characters;

}
