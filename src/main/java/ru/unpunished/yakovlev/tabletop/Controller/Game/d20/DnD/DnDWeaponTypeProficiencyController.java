package ru.unpunished.yakovlev.tabletop.Controller.Game.d20.DnD;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.unpunished.yakovlev.tabletop.Controller.AbstractController;
import ru.unpunished.yakovlev.tabletop.Model.Game.d20.DnD.DnDWeaponTypeProficiency;
import ru.unpunished.yakovlev.tabletop.Service.Game.d20.DnD.DnDWeaponTypeProficiencyService;

@Controller
@RequestMapping("/game/d20/dnd/weapontypeproficiency")
public class DnDWeaponTypeProficiencyController extends AbstractController<DnDWeaponTypeProficiency, DnDWeaponTypeProficiencyService> {
    protected DnDWeaponTypeProficiencyController(DnDWeaponTypeProficiencyService service) {
        super(service);
    }
}
