package com.example.api_teacher.teachers.editTeacher;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.api_teacher.dto.TeacherDTO;

import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/teachers")
public class EditTeacherController {

    private final EditTeacherService editTeacherService;

    @PutMapping("/{id}")
    @Operation(summary = "Editar um professor")
    public void handle(@PathVariable Long id, @RequestBody TeacherDTO teacherDTO) {
        editTeacherService.execute(id, teacherDTO);
    }
}
