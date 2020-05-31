package ru.unpunished.yakovlev.tabletop.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import ru.unpunished.yakovlev.tabletop.Model.Game.Effect;
import ru.unpunished.yakovlev.tabletop.Model.IdEntity;
import ru.unpunished.yakovlev.tabletop.Service.CrudService;
import ru.unpunished.yakovlev.tabletop.Util.Header;
import ru.unpunished.yakovlev.tabletop.Util.Payload;
import ru.unpunished.yakovlev.tabletop.Util.XmlWrapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AbstractController<T extends IdEntity, S extends CrudService<T>> implements GenericController<T> {

    protected final S service;

    @Autowired
    protected AbstractController(S service){
        this.service = service;
    }

    @Override
    public List<T> getAll() {
        List<T> list = service.getAll();
        return list;
    }

    @Override
    public void delete(Long id) {
        if(id != null){
            service.deleteById(id);
        }
    }

    @Override
    public T add(T t) {
        if(t !=null){
            T newItem = service.add(t);
            return newItem;
        }
        else{
            return null;
        }
    }

    @Override
    public T getOneById(Long id) {
        if(id != null){
            Optional<T> newItem = service.getOneById(id);
            if(newItem.isPresent()){
                return newItem.get();
            }
            else{
                return null;
            }
        }
        else {
            return null;
        }
    }

    @Override
    public T update(T t) {
        if(t !=null){
            T newItem = service.update(t);
            return newItem;
        }
        else{
            return null;
        }
    }
}
