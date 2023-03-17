package com.exrule.demotest.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.ZonedDateTime;

@Getter
@Setter
@Entity(name = "cars")
public class Cars {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer carIssue;
    @ManyToOne
    @JoinColumn(name = "manufacturer_id")
    private Manufacturers manufacturers;
    @OneToOne(mappedBy = "car", cascade = CascadeType.ALL, orphanRemoval = true)
    private Ratings ratings;
    @CreationTimestamp
    private ZonedDateTime createDate;
    @UpdateTimestamp
    private ZonedDateTime updateDate;
}
