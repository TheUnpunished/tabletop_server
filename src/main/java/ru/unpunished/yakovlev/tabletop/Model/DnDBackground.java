package ru.unpunished.yakovlev.tabletop.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class DnDBackground {

    private String name;
    private String introduction;
    private Integer allowedSkillProfCount;
    private List<DnDSkill> skillProficiencies;
    private Integer allowedToolProfCount;
    private List<DnDTool> toolProficiencies;
    private Integer allowedLanguangeCount;
    private List<DnDLanguage> languages;
    private Integer allowedEquipmentCount;
    private List<DnDItem> equipment;
    private String featureName;
    private String featureDescription;
    private DnDPhysCharacteristics physCharacteristics;
    private DnDPersCharacteristics persCharacteristics;
    private DnDNotes notes;

}
