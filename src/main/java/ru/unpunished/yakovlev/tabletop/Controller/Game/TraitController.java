package ru.unpunished.yakovlev.tabletop.Controller.Game;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.unpunished.yakovlev.tabletop.Controller.AbstractController;
import ru.unpunished.yakovlev.tabletop.Model.Game.Trait;
import ru.unpunished.yakovlev.tabletop.Service.Game.TraitService;

@Controller
@RequestMapping("/game/trait")
public class TraitController extends AbstractController<Trait, TraitService> {
    protected TraitController(TraitService service) {
        super(service);
    }
}
