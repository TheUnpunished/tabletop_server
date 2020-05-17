package ru.unpunished.yakovlev.tabletop.Service.Game.DnD;

import org.springframework.stereotype.Service;
import ru.unpunished.yakovlev.tabletop.Model.Game.d20.DnD.DnDInitiativeEffect;
import ru.unpunished.yakovlev.tabletop.Repository.Game.d20.DnD.DnDInitiativeEffectRepository;
import ru.unpunished.yakovlev.tabletop.Service.CrudServiceImpl;

@Service
public class DnDInitiativeEffectService extends CrudServiceImpl<DnDInitiativeEffect, DnDInitiativeEffectRepository> {
    public DnDInitiativeEffectService(DnDInitiativeEffectRepository genericRepository) {
        super(genericRepository);
    }
}
