package ru.unpunished.yakovlev.tabletop.Service.Game;

import org.springframework.stereotype.Service;
import ru.unpunished.yakovlev.tabletop.Model.Game.Damage;
import ru.unpunished.yakovlev.tabletop.Repository.Game.DamageRepository;
import ru.unpunished.yakovlev.tabletop.Service.CrudServiceImpl;

@Service
public class DamageService extends CrudServiceImpl<Damage, DamageRepository> {
    public DamageService(DamageRepository genericRepository) {
        super(genericRepository);
    }
}
