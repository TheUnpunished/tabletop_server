package ru.unpunished.yakovlev.tabletop.Controller.Game;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.unpunished.yakovlev.tabletop.Controller.AbstractController;
import ru.unpunished.yakovlev.tabletop.Model.Game.Speed;
import ru.unpunished.yakovlev.tabletop.Service.Game.SpeedService;

@Controller
@RequestMapping("/game/speed")
public class SpeedController extends AbstractController<Speed, SpeedService> {
    protected SpeedController(SpeedService service) {
        super(service);
    }
}
