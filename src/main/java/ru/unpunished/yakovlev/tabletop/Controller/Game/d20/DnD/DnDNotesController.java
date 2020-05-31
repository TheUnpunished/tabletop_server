package ru.unpunished.yakovlev.tabletop.Controller.Game.d20.DnD;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.unpunished.yakovlev.tabletop.Controller.AbstractController;
import ru.unpunished.yakovlev.tabletop.Model.Game.d20.DnD.DnDNotes;
import ru.unpunished.yakovlev.tabletop.Service.Game.d20.DnD.DnDNotesService;

@Controller
@RequestMapping("/game/d20/dnd/notes")
public class DnDNotesController extends AbstractController<DnDNotes, DnDNotesService> {
    protected DnDNotesController(DnDNotesService service) {
        super(service);
    }
}
