package com.launchcode.task_nest.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class TaskDetail {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String description;
    private Date date;
}
