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
    @ManyToOne(cascade = {CascadeType.MERGE})
    @JoinColumn(name = "chip_vendor_id")
    private Vendor chipVendor;
    @ManyToOne(cascade = {CascadeType.MERGE})
    @JoinColumn(name = "board_vendor_id")
    private Vendor boardVendor;
    @Column(name = "model")
    private String model;
    @ManyToOne(cascade = {CascadeType.MERGE})
    @JoinColumn(name = "vram_id")
    private Vram vram;
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "core_vrm_id")
    private Vrm coreVrm;
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "memory_vrm_id")
    private Vrm memoryVrm;
}
