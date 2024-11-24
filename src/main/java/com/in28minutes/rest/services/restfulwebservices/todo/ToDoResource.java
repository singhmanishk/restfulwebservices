package com.in28minutes.rest.services.restfulwebservices.todo;

import com.in28minutes.rest.services.restfulwebservices.todo.ToDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ToDoResource {
    @Autowired
    private ToDoHardCodedService toDoHardCodedService;

    @GetMapping("/user/{username}/todos")
    public List<ToDo> getAllToDos(@PathVariable String username) {
        return toDoHardCodedService.findAll();
    }

    @DeleteMapping("/users/{username}/todos/{id}")
    public ResponseEntity<Void> deleteTodo(@PathVariable String username, @PathVariable long id) {
        ToDo todo = toDoHardCodedService.deleteById(id);
        if(todo != null) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
