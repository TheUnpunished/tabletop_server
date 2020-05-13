package ru.unpunished.yakovlev.tabletop.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class DnDRace {

    private Long id;
    private String name;
    private Integer[] statsAffection;
    private List<DnDTool> toolsProficiencies;
    private List<DnDSkill> skillProficiencies;

}
