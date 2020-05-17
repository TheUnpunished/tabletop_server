package ru.unpunished.yakovlev.tabletop.Service.Game.DnD;

import org.springframework.stereotype.Service;
import ru.unpunished.yakovlev.tabletop.Model.Game.d20.DnD.DnDPersCharacteristics;
import ru.unpunished.yakovlev.tabletop.Repository.Game.d20.DnD.DnDPersCharacteristicsRepository;
import ru.unpunished.yakovlev.tabletop.Service.CrudServiceImpl;

@Service
public class DnDPersCharacteristicsService extends CrudServiceImpl<DnDPersCharacteristics, DnDPersCharacteristicsRepository> {
    public DnDPersCharacteristicsService(DnDPersCharacteristicsRepository genericRepository) {
        super(genericRepository);
    }
}
