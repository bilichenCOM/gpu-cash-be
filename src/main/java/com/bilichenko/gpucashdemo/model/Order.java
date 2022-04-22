package com.bilichenko.gpucashdemo.model;

import lombok.Data;

import java.util.Date;

@Data
public class Order {

    private Long id;
    private Gpu gpu;
    private Customer customer;
    private String description;
    private Status status;
    private Date from;
    private Date to;
    private Date finishedAt;
}
