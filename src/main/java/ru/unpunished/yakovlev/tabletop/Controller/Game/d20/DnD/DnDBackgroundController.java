package ru.unpunished.yakovlev.tabletop.Controller.Game.d20.DnD;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.unpunished.yakovlev.tabletop.Controller.AbstractController;
import ru.unpunished.yakovlev.tabletop.Model.Game.d20.DnD.DnDBackground;
import ru.unpunished.yakovlev.tabletop.Service.Game.d20.DnD.DnDBackgroundService;

@Controller
@RequestMapping("/game/d20/dnd/background")
public class DnDBackgroundController extends AbstractController<DnDBackground, DnDBackgroundService> {
    protected DnDBackgroundController(DnDBackgroundService service) {
        super(service);
    }
}
