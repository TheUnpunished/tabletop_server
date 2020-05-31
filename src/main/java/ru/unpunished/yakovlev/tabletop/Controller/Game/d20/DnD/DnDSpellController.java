package ru.unpunished.yakovlev.tabletop.Controller.Game.d20.DnD;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.unpunished.yakovlev.tabletop.Controller.AbstractController;
import ru.unpunished.yakovlev.tabletop.Model.Game.d20.DnD.DnDSpell;
import ru.unpunished.yakovlev.tabletop.Service.Game.d20.DnD.DnDSpellService;

@Controller
@RequestMapping("/game/d20/dnd/spell")
public class DnDSpellController extends AbstractController<DnDSpell, DnDSpellService> {
    protected DnDSpellController(DnDSpellService service) {
        super(service);
    }
}
