package com.food.foodapp.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "food")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;
}
