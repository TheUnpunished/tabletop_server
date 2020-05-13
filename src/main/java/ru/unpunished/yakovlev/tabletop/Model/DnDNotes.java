package ru.unpunished.yakovlev.tabletop.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DnDNotes {

    private String organizations;
    private String allies;
    private String enemies;
    private String backstory;
    private String other;

}
