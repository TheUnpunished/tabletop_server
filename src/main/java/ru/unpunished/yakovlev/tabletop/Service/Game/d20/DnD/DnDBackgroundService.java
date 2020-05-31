package ru.unpunished.yakovlev.tabletop.Service.Game.d20.DnD;

import org.springframework.stereotype.Service;
import ru.unpunished.yakovlev.tabletop.Model.Game.d20.DnD.DnDBackground;
import ru.unpunished.yakovlev.tabletop.Repository.Game.d20.DnD.DnDBackgroundRepository;
import ru.unpunished.yakovlev.tabletop.Service.CrudServiceImpl;

@Service
public class DnDBackgroundService extends CrudServiceImpl<DnDBackground, DnDBackgroundRepository> {
    public DnDBackgroundService(DnDBackgroundRepository genericRepository) {
        super(genericRepository);
    }
}
