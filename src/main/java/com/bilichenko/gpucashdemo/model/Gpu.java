package com.bilichenko.gpucashdemo.model;

import javax.persistence.*;

@Entity
@Table(name = "gpu")
public class Gpu {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
}
