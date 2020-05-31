package ru.unpunished.yakovlev.tabletop.Controller.Game.d20.DnD;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.unpunished.yakovlev.tabletop.Controller.AbstractController;
import ru.unpunished.yakovlev.tabletop.Model.Game.d20.DnD.DnDPhysCharacteristics;
import ru.unpunished.yakovlev.tabletop.Service.Game.d20.DnD.DnDPhysCharacteristicsService;

@Controller
@RequestMapping("/game/d20/dnd/physcharacteristics")
public class DnDPhysCharacteristicsController extends AbstractController<DnDPhysCharacteristics, DnDPhysCharacteristicsService> {
    protected DnDPhysCharacteristicsController(DnDPhysCharacteristicsService service) {
        super(service);
    }
}
