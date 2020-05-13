package ru.unpunished.yakovlev.tabletop.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class DnDPhysCharacteristics {

    private String hairDescription;
    private String skinDescription;
    private String eyesDescription;
    private String heightDescription;
    private String weightDescription;
    private Long age;
    private String genderDescription;

}
