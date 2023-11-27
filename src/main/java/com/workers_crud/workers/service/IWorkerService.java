package com.workers_crud.workers.service;

import com.workers_crud.workers.entity.WorkerEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IWorkerService {
    List<WorkerEntity> getWorkers();
    String saveWorker(WorkerEntity workerEntity);
    String deleteWorker(Long workerId);
}
