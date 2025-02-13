package com.example.coursehub.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EnrollmentDTO {
    private Long id;
    private Long studentId;
    private Long courseId;
}
