package ru.unpunished.yakovlev.tabletop.Service.Game;

import org.springframework.stereotype.Service;
import ru.unpunished.yakovlev.tabletop.Model.Game.Trait;
import ru.unpunished.yakovlev.tabletop.Repository.Game.TraitRepository;
import ru.unpunished.yakovlev.tabletop.Service.CrudServiceImpl;

@Service
public class TraitService extends CrudServiceImpl<Trait, TraitRepository> {
    public TraitService(TraitRepository genericRepository) {
        super(genericRepository);
    }
}
