package com.launchcode.task_nest.controllers;

import com.launchcode.task_nest.model.TaskDetail;
import com.launchcode.task_nest.repository.TaskRepository;
import com.launchcode.task_nest.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.config.Task;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/task")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @PostMapping("/add")
    public TaskDetail addTask(@RequestBody TaskDetail taskDetail){
        return taskService.addTask(taskDetail);
    }
}

