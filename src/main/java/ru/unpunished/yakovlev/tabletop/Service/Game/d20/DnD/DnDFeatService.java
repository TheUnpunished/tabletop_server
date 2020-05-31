package ru.unpunished.yakovlev.tabletop.Service.Game.d20.DnD;

import org.springframework.stereotype.Service;
import ru.unpunished.yakovlev.tabletop.Model.Game.d20.DnD.DnDFeat;
import ru.unpunished.yakovlev.tabletop.Repository.Game.d20.DnD.DnDFeatRepository;
import ru.unpunished.yakovlev.tabletop.Service.CrudServiceImpl;

@Service
public class DnDFeatService extends CrudServiceImpl<DnDFeat, DnDFeatRepository> {
    public DnDFeatService(DnDFeatRepository genericRepository) {
        super(genericRepository);
    }
}
