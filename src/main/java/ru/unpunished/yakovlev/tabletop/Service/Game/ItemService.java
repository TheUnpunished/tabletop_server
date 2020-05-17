package ru.unpunished.yakovlev.tabletop.Service.Game;

import org.springframework.stereotype.Service;
import ru.unpunished.yakovlev.tabletop.Model.Game.Item;
import ru.unpunished.yakovlev.tabletop.Repository.Game.ItemRepository;
import ru.unpunished.yakovlev.tabletop.Service.CrudServiceImpl;

@Service
public class ItemService extends CrudServiceImpl<Item, ItemRepository> {
    public ItemService(ItemRepository genericRepository) {
        super(genericRepository);
    }
}
