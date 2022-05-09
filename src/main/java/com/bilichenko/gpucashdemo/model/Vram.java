package com.bilichenko.gpucashdemo.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "vram")
public class Vram {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "vendor_id")
    private Vendor vendor;
    @Column(name = "chip_model")
    private String chipModel;
    @Column(name = "size")
    private Integer size;
}
