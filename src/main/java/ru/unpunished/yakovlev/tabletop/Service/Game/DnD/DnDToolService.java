package ru.unpunished.yakovlev.tabletop.Service.Game.DnD;

import org.springframework.stereotype.Service;
import ru.unpunished.yakovlev.tabletop.Model.Game.d20.DnD.DnDTool;
import ru.unpunished.yakovlev.tabletop.Repository.Game.d20.DnD.DnDToolRepository;
import ru.unpunished.yakovlev.tabletop.Service.CrudServiceImpl;

@Service
public class DnDToolService extends CrudServiceImpl<DnDTool, DnDToolRepository> {
    public DnDToolService(DnDToolRepository genericRepository) {
        super(genericRepository);
    }
}
