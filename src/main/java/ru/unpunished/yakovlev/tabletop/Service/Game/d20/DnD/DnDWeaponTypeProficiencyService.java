package ru.unpunished.yakovlev.tabletop.Service.Game.d20.DnD;

import org.springframework.stereotype.Service;
import ru.unpunished.yakovlev.tabletop.Model.Game.d20.DnD.DnDWeaponTypeProficiency;
import ru.unpunished.yakovlev.tabletop.Repository.Game.d20.DnD.DnDWeaponTypeProficiencyRepository;
import ru.unpunished.yakovlev.tabletop.Service.CrudServiceImpl;

@Service
public class DnDWeaponTypeProficiencyService extends CrudServiceImpl<DnDWeaponTypeProficiency, DnDWeaponTypeProficiencyRepository> {
    public DnDWeaponTypeProficiencyService(DnDWeaponTypeProficiencyRepository genericRepository) {
        super(genericRepository);
    }
}
