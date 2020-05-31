package ru.unpunished.yakovlev.tabletop.Controller.Game.d20.DnD;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.unpunished.yakovlev.tabletop.Controller.AbstractController;
import ru.unpunished.yakovlev.tabletop.Model.Game.d20.DnD.DnDWeapon;
import ru.unpunished.yakovlev.tabletop.Service.Game.d20.DnD.DnDWeaponService;

@Controller
@RequestMapping("/game/d20/dnd/weapon")
public class DnDWeaponController extends AbstractController<DnDWeapon, DnDWeaponService> {
    protected DnDWeaponController(DnDWeaponService service) {
        super(service);
    }
}
