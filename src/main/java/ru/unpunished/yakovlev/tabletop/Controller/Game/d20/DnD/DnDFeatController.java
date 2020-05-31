package ru.unpunished.yakovlev.tabletop.Controller.Game.d20.DnD;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.unpunished.yakovlev.tabletop.Controller.AbstractController;
import ru.unpunished.yakovlev.tabletop.Model.Game.d20.DnD.DnDFeat;
import ru.unpunished.yakovlev.tabletop.Service.Game.d20.DnD.DnDFeatService;

@Controller
@RequestMapping("/game/d20/dnd/feat")
public class DnDFeatController extends AbstractController<DnDFeat, DnDFeatService> {
    protected DnDFeatController(DnDFeatService service) {
        super(service);
    }
}
