package ru.unpunished.yakovlev.tabletop.Service.Game.DnD;

import org.springframework.stereotype.Service;
import ru.unpunished.yakovlev.tabletop.Model.Game.d20.DnD.DnDArmorProficiency;
import ru.unpunished.yakovlev.tabletop.Repository.Game.d20.DnD.DnDArmorProficiencyRepository;
import ru.unpunished.yakovlev.tabletop.Service.CrudServiceImpl;

@Service
public class DnDArmorProficiencyService extends CrudServiceImpl<DnDArmorProficiency, DnDArmorProficiencyRepository> {
    public DnDArmorProficiencyService(DnDArmorProficiencyRepository genericRepository) {
        super(genericRepository);
    }
}
