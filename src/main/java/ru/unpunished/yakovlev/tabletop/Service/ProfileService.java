package ru.unpunished.yakovlev.tabletop.Service;

import org.springframework.stereotype.Service;
import ru.unpunished.yakovlev.tabletop.Model.Profile;
import ru.unpunished.yakovlev.tabletop.Repository.ProfileRepository;

@Service
public class ProfileService extends CrudServiceImpl<Profile, ProfileRepository> {
    public ProfileService(ProfileRepository genericRepository) {
        super(genericRepository);
    }
}
