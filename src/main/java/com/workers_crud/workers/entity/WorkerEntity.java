package com.workers_crud.workers.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "worker")
@AllArgsConstructor
@NoArgsConstructor
public class WorkerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "worker_id")
    private long workerId;

    @Column(name = "worker_name")
    private String workerName;

    @Column(name = "worker_last_name")
    private String workerLastName;

    @Column(name = "worker_email")
    private String workerEmail;

    @Column(name = "worker_registration_date")
    private String workerRegistrationDate;

}
