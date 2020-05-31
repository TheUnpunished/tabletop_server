package ru.unpunished.yakovlev.tabletop.Service;

import org.springframework.stereotype.Service;
import ru.unpunished.yakovlev.tabletop.Model.TabletopUser;
import ru.unpunished.yakovlev.tabletop.Repository.TabletopUserRepository;

@Service
public class TabletopUserService extends CrudServiceImpl<TabletopUser, TabletopUserRepository> {
    public TabletopUserService(TabletopUserRepository genericRepository) {
        super(genericRepository);
    }
}
