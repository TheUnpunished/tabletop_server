package ru.unpunished.yakovlev.tabletop.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.unpunished.yakovlev.tabletop.Model.Profile;
import ru.unpunished.yakovlev.tabletop.Service.ProfileService;

@Controller
@RequestMapping("/profile")
public class ProfileController extends AbstractController<Profile, ProfileService> {
    protected ProfileController(ProfileService service) {
        super(service);
    }
}
