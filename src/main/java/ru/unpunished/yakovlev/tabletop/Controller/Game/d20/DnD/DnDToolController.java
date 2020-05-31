package ru.unpunished.yakovlev.tabletop.Controller.Game.d20.DnD;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.unpunished.yakovlev.tabletop.Controller.AbstractController;
import ru.unpunished.yakovlev.tabletop.Model.Game.d20.DnD.DnDTool;
import ru.unpunished.yakovlev.tabletop.Service.Game.d20.DnD.DnDToolService;

@Controller
@RequestMapping("/game/d20/dnd/tool")
public class DnDToolController extends AbstractController<DnDTool, DnDToolService> {
    protected DnDToolController(DnDToolService service) {
        super(service);
    }
}
