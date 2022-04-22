package com.bilichenko.gpucashdemo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "gpu")
public class Gpu {

    @Id
    @GeneratedValue
    private Long id;
}
