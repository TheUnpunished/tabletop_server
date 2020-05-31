package ru.unpunished.yakovlev.tabletop.Controller.Game.d20.DnD;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.unpunished.yakovlev.tabletop.Controller.AbstractController;
import ru.unpunished.yakovlev.tabletop.Model.Game.d20.DnD.DnDArmorProficiency;
import ru.unpunished.yakovlev.tabletop.Service.Game.d20.DnD.DnDArmorProficiencyService;

@Controller
@RequestMapping("/game/d20/dnd/armorproficiency")
public class DnDArmorProficiencyController extends AbstractController<DnDArmorProficiency, DnDArmorProficiencyService> {

    protected DnDArmorProficiencyController(DnDArmorProficiencyService service) {
        super(service);
    }
}
