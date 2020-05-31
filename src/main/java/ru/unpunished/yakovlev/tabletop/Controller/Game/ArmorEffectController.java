package ru.unpunished.yakovlev.tabletop.Controller.Game;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.unpunished.yakovlev.tabletop.Controller.AbstractController;
import ru.unpunished.yakovlev.tabletop.Model.Game.ArmorEffect;
import ru.unpunished.yakovlev.tabletop.Service.Game.ArmorEffectService;

@Controller
@RequestMapping("/game/armoreffect")
public class ArmorEffectController extends AbstractController<ArmorEffect, ArmorEffectService> {
    protected ArmorEffectController(ArmorEffectService service) {
        super(service);
    }
}
