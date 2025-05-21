package com.launchcode.task_nest.service;

import com.launchcode.task_nest.model.TaskDetail;
import com.launchcode.task_nest.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;


    public TaskDetail addTask(TaskDetail taskDetail){
       return taskRepository.save(taskDetail);
    }
}
