package ru.unpunished.yakovlev.tabletop.Controller.Game.d20.DnD;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.unpunished.yakovlev.tabletop.Controller.AbstractController;
import ru.unpunished.yakovlev.tabletop.Model.Game.d20.DnD.DnDSkill;
import ru.unpunished.yakovlev.tabletop.Service.Game.d20.DnD.DnDSkillService;

@Controller
@RequestMapping("/game/d20/dnd/skill")
public class DnDSkillController extends AbstractController<DnDSkill, DnDSkillService> {
    protected DnDSkillController(DnDSkillService service) {
        super(service);
    }
}
