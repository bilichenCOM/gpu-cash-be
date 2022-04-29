package com.bilichenko.gpucashdemo.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "vendor")
public class Vendor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
}