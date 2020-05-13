package ru.unpunished.yakovlev.tabletop.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.unpunished.yakovlev.tabletop.UtilGame.GameType;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Character {

    private User owner;
    private String name;
    private Long exp;
    private Integer lvl;
    private Integer maxHealth;
    private GameType gameType;
    private Boolean isOriginal;
    private Boolean isPublic;
    private List<User> sharedWith;

}
