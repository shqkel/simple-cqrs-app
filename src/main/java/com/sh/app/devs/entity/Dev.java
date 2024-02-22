package com.sh.app.devs.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Entity
@Table
@Data
public class Dev implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
}
