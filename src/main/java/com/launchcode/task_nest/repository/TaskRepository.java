package com.launchcode.task_nest.repository;

import com.launchcode.task_nest.model.TaskDetail;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends CrudRepository<TaskDetail,Long> {
}
