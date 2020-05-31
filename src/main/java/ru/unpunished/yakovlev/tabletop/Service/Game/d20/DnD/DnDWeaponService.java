package ru.unpunished.yakovlev.tabletop.Service.Game.d20.DnD;

import org.springframework.stereotype.Service;
import ru.unpunished.yakovlev.tabletop.Model.Game.d20.DnD.DnDWeapon;
import ru.unpunished.yakovlev.tabletop.Repository.Game.d20.DnD.DnDWeaponRepository;
import ru.unpunished.yakovlev.tabletop.Service.CrudServiceImpl;

@Service
public class DnDWeaponService extends CrudServiceImpl<DnDWeapon, DnDWeaponRepository> {
    public DnDWeaponService(DnDWeaponRepository genericRepository) {
        super(genericRepository);
    }
}
