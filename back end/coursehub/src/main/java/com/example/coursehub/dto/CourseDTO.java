package com.example.coursehub.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CourseDTO {
    private Long id;
    private String title;
    private String description;
    private Long instructorId;
}
