package ru.unpunished.yakovlev.tabletop.Service.Game.d20;

import org.springframework.stereotype.Service;
import ru.unpunished.yakovlev.tabletop.Model.Game.d20.d20Character;
import ru.unpunished.yakovlev.tabletop.Repository.Game.d20.d20CharacterRepository;
import ru.unpunished.yakovlev.tabletop.Service.CrudServiceImpl;

@Service
public class d20CharacterService extends CrudServiceImpl<d20Character, d20CharacterRepository> {
    public d20CharacterService(d20CharacterRepository genericRepository) {
        super(genericRepository);
    }
}
