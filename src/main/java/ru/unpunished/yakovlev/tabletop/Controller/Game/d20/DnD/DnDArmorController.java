package ru.unpunished.yakovlev.tabletop.Controller.Game.d20.DnD;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.unpunished.yakovlev.tabletop.Controller.AbstractController;
import ru.unpunished.yakovlev.tabletop.Model.Game.d20.DnD.DnDArmor;
import ru.unpunished.yakovlev.tabletop.Service.Game.d20.DnD.DnDArmorService;

@Controller
@RequestMapping("/game/d20/dnd/armor")
public class DnDArmorController extends AbstractController<DnDArmor, DnDArmorService> {

    protected DnDArmorController(DnDArmorService service) {
        super(service);
    }
}
