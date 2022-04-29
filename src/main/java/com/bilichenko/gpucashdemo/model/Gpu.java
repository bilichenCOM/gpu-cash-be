package com.bilichenko.gpucashdemo.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "gpu")
public class Gpu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "vendor_id")
    private Vendor vendor;
    @Column(name = "model")
    private String model;
    @Column(name = "ram_size")
    private Integer ramSize;
}
