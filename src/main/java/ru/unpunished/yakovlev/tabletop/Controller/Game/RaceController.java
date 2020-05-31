package ru.unpunished.yakovlev.tabletop.Controller.Game;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.unpunished.yakovlev.tabletop.Controller.AbstractController;
import ru.unpunished.yakovlev.tabletop.Model.Game.Race;
import ru.unpunished.yakovlev.tabletop.Service.Game.RaceService;

@Controller
@RequestMapping("/game/race")
public class RaceController extends AbstractController<Race, RaceService> {
    protected RaceController(RaceService service) {
        super(service);
    }
}
