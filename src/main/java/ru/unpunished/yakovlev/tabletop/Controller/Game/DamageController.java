package ru.unpunished.yakovlev.tabletop.Controller.Game;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.unpunished.yakovlev.tabletop.Controller.AbstractController;
import ru.unpunished.yakovlev.tabletop.Model.Game.Damage;
import ru.unpunished.yakovlev.tabletop.Service.Game.DamageService;

@Controller
@RequestMapping("/game/damage")
public class DamageController extends AbstractController<Damage, DamageService> {
    protected DamageController(DamageService service) {
        super(service);
    }
}
