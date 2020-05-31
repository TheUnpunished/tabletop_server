package ru.unpunished.yakovlev.tabletop.Service.Game.d20.DnD;

import org.springframework.stereotype.Service;
import ru.unpunished.yakovlev.tabletop.Model.Game.d20.DnD.DnDSpell;
import ru.unpunished.yakovlev.tabletop.Repository.Game.d20.DnD.DnDSpellRepository;
import ru.unpunished.yakovlev.tabletop.Service.CrudServiceImpl;

@Service
public class DnDSpellService extends CrudServiceImpl<DnDSpell, DnDSpellRepository> {
    public DnDSpellService(DnDSpellRepository genericRepository) {
        super(genericRepository);
    }
}
