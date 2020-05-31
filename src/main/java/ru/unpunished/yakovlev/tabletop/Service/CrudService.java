package ru.unpunished.yakovlev.tabletop.Service;

import ru.unpunished.yakovlev.tabletop.Model.IdEntity;

import java.util.List;
import java.util.Optional;

public interface CrudService<T extends IdEntity>{
    List<T> getAll();
    T add(T t);
    T update(T t);
    void delete(T t);
    void deleteById(Long id);
    Optional<T> getOneById(Long id);
}
