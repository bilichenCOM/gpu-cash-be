package com.bilichenko.gpucashdemo.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "t_order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "gpu_id")
    private Gpu gpu;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "customer_id")
    private Customer customer;
    @Column(name = "description")
    private String description;
    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private Status status;
    @Column(name = "from_date")
    private Date from;
    @Column(name = "to_date")
    private Date to;
    @Column(name = "finished_at_date")
    private Date finishedAt;
}
