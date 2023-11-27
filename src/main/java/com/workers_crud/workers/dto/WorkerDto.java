package com.workers_crud.workers.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class WorkerDto {
    private long workerId;
    private String workerName;
    private String workerLastName;
    private String workerEmail;
    private String workerRegistrationDate;
}
