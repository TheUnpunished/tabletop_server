package ru.unpunished.yakovlev.tabletop.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;
import ru.unpunished.yakovlev.tabletop.Model.IdEntity;

@NoRepositoryBean
public interface GenericRepository<T extends IdEntity> extends CrudRepository<T, Long> {

}
