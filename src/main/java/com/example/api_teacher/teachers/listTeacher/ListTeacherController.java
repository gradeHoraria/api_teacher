package com.example.api_teacher.teachers.listTeacher;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.api_teacher.dto.TeacherDTO;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/teachers")
public class ListTeacherController {
    
    private final ListTeacherService listTeacherService;

    @GetMapping
    public List<TeacherDTO> handle() {
        return listTeacherService.execute();
    }
}
