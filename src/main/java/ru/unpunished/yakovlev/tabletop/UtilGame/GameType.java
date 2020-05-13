package ru.unpunished.yakovlev.tabletop.UtilGame;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public enum GameType {

    OPEN(0),
    DND(1);

    private Integer id;
}
