package com.examly.springapp.repository;

import org.springframework.data.repository.CrudRepository;
// repository that extends the CrudRepository
import com.examly.springapp.bean.Tasks;

public interface TasksRepository extends CrudRepository<Tasks, Integer>
{ 
    
}