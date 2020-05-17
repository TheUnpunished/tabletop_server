package ru.unpunished.yakovlev.tabletop.Service.Game;

import org.springframework.stereotype.Service;
import ru.unpunished.yakovlev.tabletop.Model.Game.ArmorEffect;
import ru.unpunished.yakovlev.tabletop.Repository.Game.ArmorEffectRepository;
import ru.unpunished.yakovlev.tabletop.Service.CrudServiceImpl;

@Service
public class ArmorEffectService extends CrudServiceImpl<ArmorEffect, ArmorEffectRepository> {
    public ArmorEffectService(ArmorEffectRepository genericRepository) {
        super(genericRepository);
    }
}
