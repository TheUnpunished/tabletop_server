package ru.unpunished.yakovlev.tabletop.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.unpunished.yakovlev.tabletop.Model.TabletopUser;
import ru.unpunished.yakovlev.tabletop.Service.TabletopUserService;

@Controller
@RequestMapping("/tabletopuser")
public class TabletopUserController extends AbstractController<TabletopUser, TabletopUserService> {
    protected TabletopUserController(TabletopUserService service) {
        super(service);
    }
}
