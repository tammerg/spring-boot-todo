package com.todo.springboot.firstspringtodo.api;
import org.springframework.web.bind.annotation.*;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import java.util.List;
import com.todo.springboot.firstspringtodo.Models.Task;

@RequestMapping("api/task")
@RestController
class TaskController {

    @Autowired
    JdbcTemplate connection;

    @Autowired
    DataSource dataSource;

    @GetMapping
    List<Task> getAllTasks() {
        List<Task> list = connection.query("SELECT * FROM tasks", new BeanPropertyRowMapper(Task.class));

        return list;
    }
    @PostMapping
    void addTask(@RequestBody Task newTask){
        connection.update("INSERT INTO tasks(task) VALUES (?)", newTask.getTask());
    }
}