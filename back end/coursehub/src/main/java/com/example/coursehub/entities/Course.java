package com.example.coursehub.entities;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

@Entity
@Table(name = "course")
@Data
@Builder
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;

    @ManyToOne
    @JoinColumn(name = "instructor_id")
    private User instructor;
}
