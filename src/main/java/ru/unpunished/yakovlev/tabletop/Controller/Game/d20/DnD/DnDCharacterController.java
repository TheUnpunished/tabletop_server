package ru.unpunished.yakovlev.tabletop.Controller.Game.d20.DnD;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.unpunished.yakovlev.tabletop.Controller.AbstractController;
import ru.unpunished.yakovlev.tabletop.Model.Game.d20.DnD.DnDCharacter;
import ru.unpunished.yakovlev.tabletop.Service.Game.d20.DnD.DnDCharacterService;

@Controller
@RequestMapping("/game/d20/dnd/character")
public class DnDCharacterController extends AbstractController<DnDCharacter, DnDCharacterService> {
    protected DnDCharacterController(DnDCharacterService service) {
        super(service);
    }
}
