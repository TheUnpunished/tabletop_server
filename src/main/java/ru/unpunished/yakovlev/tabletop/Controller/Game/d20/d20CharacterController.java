package ru.unpunished.yakovlev.tabletop.Controller.Game.d20;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.unpunished.yakovlev.tabletop.Controller.AbstractController;
import ru.unpunished.yakovlev.tabletop.Model.Game.d20.d20Character;
import ru.unpunished.yakovlev.tabletop.Service.Game.d20.d20CharacterService;

@Controller
@RequestMapping("/game/d20/character")
public class d20CharacterController extends AbstractController<d20Character, d20CharacterService> {
    protected d20CharacterController(d20CharacterService service) {
        super(service);
    }
}
