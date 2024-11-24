package com.in28minutes.rest.services.restfulwebservices.todo;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ToDoHardCodedService {

    private static List<ToDo> todos = new ArrayList<ToDo>();
    private static int counter = 0;
    static  {
        todos.add(new ToDo(++counter, "ms95890", "Learn Angular", new Date(),false));
        todos.add(new ToDo(++counter, "ms95890", "Microservices", new Date(),false));
    }
    public List<ToDo> findAll() {
        return todos;
    }

    public ToDo deleteById(long id) {
        ToDo todelete= findById(id);
        return (todelete != null ? todos.remove(todelete) : false) ? todelete : null;
    }

    public ToDo findById(long id) {
        return todos.stream().filter(x->x.getId()==id).collect(Collectors.toList()).get(0);
    }
}
