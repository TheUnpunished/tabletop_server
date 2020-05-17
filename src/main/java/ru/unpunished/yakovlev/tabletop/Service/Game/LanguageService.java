package ru.unpunished.yakovlev.tabletop.Service.Game;

import org.springframework.stereotype.Service;
import ru.unpunished.yakovlev.tabletop.Model.Game.Language;
import ru.unpunished.yakovlev.tabletop.Repository.Game.LanguageRepository;
import ru.unpunished.yakovlev.tabletop.Service.CrudServiceImpl;

@Service
public class LanguageService extends CrudServiceImpl<Language, LanguageRepository> {
    public LanguageService(LanguageRepository genericRepository) {
        super(genericRepository);
    }
}
