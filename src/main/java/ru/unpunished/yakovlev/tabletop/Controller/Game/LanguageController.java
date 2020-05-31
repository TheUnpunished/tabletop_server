package ru.unpunished.yakovlev.tabletop.Controller.Game;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.unpunished.yakovlev.tabletop.Controller.AbstractController;
import ru.unpunished.yakovlev.tabletop.Model.Game.Language;
import ru.unpunished.yakovlev.tabletop.Service.Game.LanguageService;

@Controller
@RequestMapping("/game/language")
public class LanguageController extends AbstractController<Language, LanguageService> {
    protected LanguageController(LanguageService service) {
        super(service);
    }
}
