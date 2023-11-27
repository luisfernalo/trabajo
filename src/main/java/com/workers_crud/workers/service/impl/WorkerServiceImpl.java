package com.workers_crud.workers.service.impl;

import com.workers_crud.workers.entity.WorkerEntity;
import com.workers_crud.workers.repository.IWorkerRepository;
import com.workers_crud.workers.service.IWorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkerServiceImpl implements IWorkerService {
    @Autowired
    private IWorkerRepository workerRepository;

    @Override
    public List<WorkerEntity> getWorkers(){
        return workerRepository.findAll();
    }

    @Override
    public String saveWorker(WorkerEntity workerEntity){
        return  String.valueOf(workerRepository.save(workerEntity));
    }

    @Override
    public String deleteWorker(Long workerId){
        workerRepository.deleteById(workerId);
        return "eliminado";
    }
}
