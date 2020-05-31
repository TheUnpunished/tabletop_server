package ru.unpunished.yakovlev.tabletop.Controller.Game.d20.DnD;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.unpunished.yakovlev.tabletop.Controller.AbstractController;
import ru.unpunished.yakovlev.tabletop.Model.Game.d20.DnD.DnDPersCharacteristics;
import ru.unpunished.yakovlev.tabletop.Service.CrudService;
import ru.unpunished.yakovlev.tabletop.Service.Game.d20.DnD.DnDPersCharacteristicsService;

@Controller
@RequestMapping("/game/d20/dnd/perscharacteristics")
public class DnDPersCharacteristicsController extends AbstractController<DnDPersCharacteristics, DnDPersCharacteristicsService> {
    protected DnDPersCharacteristicsController(DnDPersCharacteristicsService service) {
        super(service);
    }
}
