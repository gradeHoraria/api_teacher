package com.example.api_teacher.teachers.viewTeacher;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.api_teacher.dto.TeacherDTO;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/teachers")
public class ViewTeacherController {
    
    private final ViewTeacherService viewTeacherService;

    @GetMapping("/{id}")
    public TeacherDTO handle(@PathVariable Long id) {
        return viewTeacherService.execute(id);
    }
}
