package com.application.dao.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@ToString
@Table(name = "GEO_CODE_ADDRESS",
        indexes = {
                @Index(name = "INDEX_ADDRESS", columnList = "ADDRESS", unique = false),
                @Index(name = "INDEX_FILE_ID", columnList = "FILE_ID", unique = false)
        })
public class GeoCodeAddress extends BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "FILE_ID", nullable = false)
    private String fileId;

    @Column(name = "ADDRESS", nullable = false)
    private String address;

    @Column(name = "LATITUDE")
    private double lat;

    @Column(name = "LONGITUDE")
    private double lng;


}
