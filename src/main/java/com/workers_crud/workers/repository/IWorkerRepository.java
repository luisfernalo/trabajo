package com.workers_crud.workers.repository;

import com.workers_crud.workers.entity.WorkerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IWorkerRepository extends JpaRepository<WorkerEntity,Long>{

}
