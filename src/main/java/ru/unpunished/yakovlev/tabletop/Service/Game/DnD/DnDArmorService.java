package ru.unpunished.yakovlev.tabletop.Service.Game.DnD;

import org.springframework.stereotype.Service;
import ru.unpunished.yakovlev.tabletop.Model.Game.d20.DnD.DnDArmor;
import ru.unpunished.yakovlev.tabletop.Repository.Game.d20.DnD.DnDArmorRepository;
import ru.unpunished.yakovlev.tabletop.Service.CrudServiceImpl;

@Service
public class DnDArmorService extends CrudServiceImpl<DnDArmor, DnDArmorRepository> {
    public DnDArmorService(DnDArmorRepository genericRepository) {
        super(genericRepository);
    }
}
