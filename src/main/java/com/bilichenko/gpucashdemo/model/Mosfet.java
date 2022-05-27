package com.bilichenko.gpucashdemo.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "mosfet")
public class Mosfet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
}
