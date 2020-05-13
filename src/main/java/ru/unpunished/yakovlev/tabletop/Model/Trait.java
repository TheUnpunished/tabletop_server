package ru.unpunished.yakovlev.tabletop.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.unpunished.yakovlev.tabletop.UtilGame.GameType;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Trait {

    private Long id;
    private String name;
    private String description;
    private GameType gameType;

    public void takeEffect(Character character){

    }

}
