package com.zkk.spring_boot_mvc.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import java.time.LocalDateTime;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 25, nullable = false)
    private String name;

    @Column(length = 25, nullable = false)
    private String email;

    @Column(length = 25, nullable = false)
    private String password;

    @CreationTimestamp
    private LocalDateTime createdDate;

}
