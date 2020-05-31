package ru.unpunished.yakovlev.tabletop.Controller.Game.d20.DnD;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.unpunished.yakovlev.tabletop.Controller.AbstractController;
import ru.unpunished.yakovlev.tabletop.Model.Game.d20.DnD.DnDWeaponClassProficiency;
import ru.unpunished.yakovlev.tabletop.Service.Game.d20.DnD.DnDWeaponClassProficiencyService;

@Controller
@RequestMapping("/game/d20/dnd/weaponclassproficiency")
public class DnDWeaponClassProficiencyController extends AbstractController<DnDWeaponClassProficiency, DnDWeaponClassProficiencyService> {
    protected DnDWeaponClassProficiencyController(DnDWeaponClassProficiencyService service) {
        super(service);
    }
}
