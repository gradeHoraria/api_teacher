package com.example.api_teacher.teachers.deleteTeacher;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/teachers")
public class DeleteTeacherController {

    private final DeleteTeacherService deleteTeacherService;

    @DeleteMapping("/{id}")
    @Operation(summary = "Deletar um professor")
    public void handle(@PathVariable Long id) {
        deleteTeacherService.execute(id);
    }    
}
