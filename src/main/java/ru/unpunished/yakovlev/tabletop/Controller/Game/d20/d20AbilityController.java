package ru.unpunished.yakovlev.tabletop.Controller.Game.d20;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.unpunished.yakovlev.tabletop.Controller.AbstractController;
import ru.unpunished.yakovlev.tabletop.Model.Game.d20.d20Ability;
import ru.unpunished.yakovlev.tabletop.Service.Game.d20.d20AbilityService;

@Controller
@RequestMapping("/game/d20/ability")
public class d20AbilityController extends AbstractController<d20Ability, d20AbilityService> {
    protected d20AbilityController(d20AbilityService service) {
        super(service);
    }
}
