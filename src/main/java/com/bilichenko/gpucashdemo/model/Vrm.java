package com.bilichenko.gpucashdemo.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "vrm")
public class Vrm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "pwm_controller_id")
    private PwmController pwmController;
    @Enumerated(EnumType.STRING)
    @Column(name = "vrm_type")
    private VrmType vrmType;
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "mosfet_id")
    private Mosfet mosfet;
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "mosfet_driver_id")
    private MosfetDriver mosfetDriver;
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "n_mosfet_id")
    private NMosfet nMosfet;
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "dr_mos_id")
    private DrMos drMos;
}
