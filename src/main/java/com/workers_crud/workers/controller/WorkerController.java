package com.workers_crud.workers.controller;

import com.workers_crud.workers.dto.WorkerDto;
import com.workers_crud.workers.entity.WorkerEntity;
import com.workers_crud.workers.repository.IWorkerRepository;
import com.workers_crud.workers.service.IWorkerService;
import com.workers_crud.workers.utils.WorkersConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/worker")
public class WorkerController {
    @Autowired
    private WorkersConverter workersConverter;
    @Autowired
    private IWorkerService workerService;
    @Autowired
    private IWorkerRepository workerRepository;

    @GetMapping(path = "/get",produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody ResponseEntity<List<WorkerEntity>> getWorkers(){
        return new ResponseEntity<>(workerService.getWorkers(), HttpStatus.OK);
    }

    @PostMapping(path = "/saveWorker",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody ResponseEntity<String> saveWorker(@RequestBody WorkerDto workerDto){

        return new ResponseEntity<>(workerService.saveWorker(workersConverter.convertWorkerDtoToEntity(workerDto)),HttpStatus.OK);
    }

    @DeleteMapping(path = "/delete/{workerId}",produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody ResponseEntity<String> deleteWorker(@PathVariable (name = "workerId") long workerId){
        System.out.println("AQUJ");
        System.out.println(workerId);
       return new ResponseEntity<>(workerService.deleteWorker(workerId),HttpStatus.OK);
    }
}
