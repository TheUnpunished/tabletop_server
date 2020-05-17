package ru.unpunished.yakovlev.tabletop.Service.Game;

import org.springframework.stereotype.Service;
import ru.unpunished.yakovlev.tabletop.Model.Game.Race;
import ru.unpunished.yakovlev.tabletop.Repository.Game.RaceRepository;
import ru.unpunished.yakovlev.tabletop.Service.CrudServiceImpl;

@Service
public class RaceService extends CrudServiceImpl<Race, RaceRepository> {
    public RaceService(RaceRepository genericRepository) {
        super(genericRepository);
    }
}
