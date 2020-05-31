package ru.unpunished.yakovlev.tabletop.Service.Game.d20.DnD;

import org.springframework.stereotype.Service;
import ru.unpunished.yakovlev.tabletop.Model.Game.d20.DnD.DnDNotes;
import ru.unpunished.yakovlev.tabletop.Repository.Game.d20.DnD.DnDNotesRepository;
import ru.unpunished.yakovlev.tabletop.Service.CrudServiceImpl;

@Service
public class DnDNotesService extends CrudServiceImpl<DnDNotes, DnDNotesRepository> {
    public DnDNotesService(DnDNotesRepository genericRepository) {
        super(genericRepository);
    }
}
