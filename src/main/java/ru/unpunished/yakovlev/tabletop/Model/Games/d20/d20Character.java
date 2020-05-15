package ru.unpunished.yakovlev.tabletop.Model.Games.d20;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.unpunished.yakovlev.tabletop.Model.Games.Character;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class d20Character extends Character {
    private d20Ability[] stats = new d20Ability[6];
}
