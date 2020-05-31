package ru.unpunished.yakovlev.tabletop.Controller.Game;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.unpunished.yakovlev.tabletop.Controller.AbstractController;
import ru.unpunished.yakovlev.tabletop.Model.Game.Item;
import ru.unpunished.yakovlev.tabletop.Service.Game.ItemService;

@Controller
@RequestMapping("/game/item")
public class ItemController extends AbstractController <Item, ItemService> {
    protected ItemController(ItemService service) {
        super(service);
    }
}
