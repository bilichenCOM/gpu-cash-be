package com.bilichenko.gpucashdemo.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity(name = "order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Gpu gpu;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
    private String description;

    @Enumerated(EnumType.STRING)
    private Status status;
    private Date from;
    private Date to;
    private Date finishedAt;
}
