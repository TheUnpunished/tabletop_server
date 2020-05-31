package ru.unpunished.yakovlev.tabletop.Service.Game.d20.DnD;

import org.springframework.stereotype.Service;
import ru.unpunished.yakovlev.tabletop.Model.Game.d20.DnD.DnDWeaponClassProficiency;
import ru.unpunished.yakovlev.tabletop.Repository.Game.d20.DnD.DnDWeaponClassProficiencyRepository;
import ru.unpunished.yakovlev.tabletop.Service.CrudServiceImpl;

@Service
public class DnDWeaponClassProficiencyService extends CrudServiceImpl<DnDWeaponClassProficiency, DnDWeaponClassProficiencyRepository> {
    public DnDWeaponClassProficiencyService(DnDWeaponClassProficiencyRepository genericRepository) {
        super(genericRepository);
    }
}
