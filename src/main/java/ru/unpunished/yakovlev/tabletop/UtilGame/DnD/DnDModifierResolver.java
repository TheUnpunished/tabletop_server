package ru.unpunished.yakovlev.tabletop.UtilGame.DnD;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class DnDModifierResolver {

    public Integer resolveModifierForStat(Integer statValue){

        if(statValue < 10){
            return (statValue - 11) / 2;
        }
        else {
            return (statValue - 10) / 2;
        }
    }

}
