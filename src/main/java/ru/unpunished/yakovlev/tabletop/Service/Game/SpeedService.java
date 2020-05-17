package ru.unpunished.yakovlev.tabletop.Service.Game;

import org.springframework.stereotype.Service;
import ru.unpunished.yakovlev.tabletop.Model.Game.Speed;
import ru.unpunished.yakovlev.tabletop.Repository.Game.SpeedRepository;
import ru.unpunished.yakovlev.tabletop.Service.CrudServiceImpl;

@Service
public class SpeedService extends CrudServiceImpl<Speed, SpeedRepository> {
    public SpeedService(SpeedRepository genericRepository) {
        super(genericRepository);
    }
}
