package ru.unpunished.yakovlev.tabletop.Service.Game.d20.DnD;

import org.springframework.stereotype.Service;
import ru.unpunished.yakovlev.tabletop.Model.Game.d20.DnD.DnDCharacter;
import ru.unpunished.yakovlev.tabletop.Repository.Game.d20.DnD.DnDCharacterRepository;
import ru.unpunished.yakovlev.tabletop.Service.CrudServiceImpl;

@Service
public class DnDCharacterService extends CrudServiceImpl<DnDCharacter, DnDCharacterRepository> {
    public DnDCharacterService(DnDCharacterRepository genericRepository) {
        super(genericRepository);
    }
}
