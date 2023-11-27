package com.workers_crud.workers.utils;

import com.workers_crud.workers.dto.WorkerDto;
import com.workers_crud.workers.entity.WorkerEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WorkersConverter {

    @Autowired
    private ModelMapper modelMapper = new ModelMapper();
    public WorkerEntity convertWorkerDtoToEntity(WorkerDto workerDto){

        return modelMapper.map(workerDto,WorkerEntity.class);

    }
}
