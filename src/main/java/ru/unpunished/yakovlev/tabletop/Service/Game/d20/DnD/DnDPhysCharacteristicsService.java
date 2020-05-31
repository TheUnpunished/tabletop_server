package ru.unpunished.yakovlev.tabletop.Service.Game.d20.DnD;

import org.springframework.stereotype.Service;
import ru.unpunished.yakovlev.tabletop.Model.Game.d20.DnD.DnDPhysCharacteristics;
import ru.unpunished.yakovlev.tabletop.Repository.Game.d20.DnD.DnDPhysCharacteristicsRepository;
import ru.unpunished.yakovlev.tabletop.Service.CrudServiceImpl;

@Service
public class DnDPhysCharacteristicsService extends CrudServiceImpl<DnDPhysCharacteristics, DnDPhysCharacteristicsRepository> {
    public DnDPhysCharacteristicsService(DnDPhysCharacteristicsRepository genericRepository) {
        super(genericRepository);
    }
}
