package com.application.dao.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Getter
@Setter
@ToString
@Table(name = "FILE_UPLOAD")
public class FileUpload extends BaseEntity implements Serializable {

    public static final long                    serialVersionUID = 2070349594952479258L;

    @Id
    @Column(name = "ID", nullable = false)
    private String id = UUID.randomUUID().toString();

    @Column(name = "FILE_NAME", columnDefinition="VARCHAR(128)", nullable = false)
    private String fileName;

    @Lob
    @Column(name = "FILE", columnDefinition="BLOB", nullable = false)
    @ToString.Exclude
    private byte[] file;

    @Column(name = "USER_ID", columnDefinition = "BIGINT(20)", nullable = false)
    private Long userId;

    @Column(name = "IS_SYNC", nullable = false)
    boolean isSync;

}
