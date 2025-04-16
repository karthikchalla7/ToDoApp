package com.example.todo.repository;

import com.example.todo.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;

//jparepository<enityrname,primarykey type>
public interface TaskRepository extends JpaRepository<Task,Long> {




}
