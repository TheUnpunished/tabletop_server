package ru.unpunished.yakovlev.tabletop.Service.Game;

import org.springframework.stereotype.Service;
import ru.unpunished.yakovlev.tabletop.Model.Game.GameClass;
import ru.unpunished.yakovlev.tabletop.Repository.Game.GameClassRepository;
import ru.unpunished.yakovlev.tabletop.Service.CrudServiceImpl;

@Service
public class GameClassService extends CrudServiceImpl<GameClass, GameClassRepository> {
    public GameClassService(GameClassRepository genericRepository) {
        super(genericRepository);
    }
}
