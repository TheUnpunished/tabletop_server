package ru.unpunished.yakovlev.tabletop.Controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ru.unpunished.yakovlev.tabletop.Model.IdEntity;
import ru.unpunished.yakovlev.tabletop.Util.XmlWrapper;

import java.util.List;

public interface
GenericController<T extends IdEntity> {

    @RequestMapping(value = "/getAll", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public List<T> getAll();

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_VALUE})
    public void delete(@PathVariable("id") Long id);

    @RequestMapping(value = "/add", method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public T add(@RequestBody T t);

    @RequestMapping(value = "/getOneById/{id}", method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public T getOneById(@PathVariable("id") Long id);

    @RequestMapping(value = "/update", method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public T update(@RequestBody T t);
    
    
}
