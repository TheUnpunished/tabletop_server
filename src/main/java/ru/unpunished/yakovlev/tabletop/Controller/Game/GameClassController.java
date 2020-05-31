package ru.unpunished.yakovlev.tabletop.Controller.Game;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.unpunished.yakovlev.tabletop.Controller.AbstractController;
import ru.unpunished.yakovlev.tabletop.Model.Game.GameClass;
import ru.unpunished.yakovlev.tabletop.Service.Game.GameClassService;

@Controller
@RequestMapping("/game/class")
public class GameClassController extends AbstractController<GameClass, GameClassService> {
    protected GameClassController(GameClassService service) {
        super(service);
    }
}
