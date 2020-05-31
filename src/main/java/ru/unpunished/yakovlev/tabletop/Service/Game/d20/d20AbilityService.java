package ru.unpunished.yakovlev.tabletop.Service.Game.d20;

import org.springframework.stereotype.Service;
import ru.unpunished.yakovlev.tabletop.Model.Game.d20.d20Ability;
import ru.unpunished.yakovlev.tabletop.Repository.Game.d20.d20AbilityRepository;
import ru.unpunished.yakovlev.tabletop.Service.CrudServiceImpl;

@Service
public class d20AbilityService extends CrudServiceImpl<d20Ability, d20AbilityRepository> {
    public d20AbilityService(d20AbilityRepository genericRepository) {
        super(genericRepository);
    }
}
