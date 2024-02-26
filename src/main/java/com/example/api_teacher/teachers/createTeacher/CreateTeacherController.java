package com.example.api_teacher.teachers.createTeacher;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.api_teacher.dto.TeacherDTO;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/teachers")
@PreAuthorize("hasRole('ADMIN')")
public class CreateTeacherController {
    
    private final CreateTeacherService createTeacherService;

    @PostMapping
    @PreAuthorize("hasRole('ADMIN')")
    public void handle(@RequestBody TeacherDTO teacherDTO) {
        createTeacherService.execute(teacherDTO);
    }
}
