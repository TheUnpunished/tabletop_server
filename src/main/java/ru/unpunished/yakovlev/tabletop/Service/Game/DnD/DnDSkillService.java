package ru.unpunished.yakovlev.tabletop.Service.Game.DnD;

import org.springframework.stereotype.Service;
import ru.unpunished.yakovlev.tabletop.Model.Game.d20.DnD.DnDSkill;
import ru.unpunished.yakovlev.tabletop.Repository.Game.d20.DnD.DnDSkillRepository;
import ru.unpunished.yakovlev.tabletop.Service.CrudServiceImpl;

@Service
public class DnDSkillService extends CrudServiceImpl<DnDSkill, DnDSkillRepository> {
    public DnDSkillService(DnDSkillRepository genericRepository) {
        super(genericRepository);
    }
}
