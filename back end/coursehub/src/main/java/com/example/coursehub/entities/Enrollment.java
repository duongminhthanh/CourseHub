package com.example.coursehub.entities;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

@Entity
@Table(name = "enrollment")
@Data
@Builder
public class Enrollment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private User student;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;
}
