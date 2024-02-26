package com.example.api_teacher.teachers.deleteTeacher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.api_teacher.repository.TeacherRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class DeleteTeacherService {
    
    private final TeacherRepository teacherRepository;
    
    public void execute(Long id) {
        teacherRepository.deleteById(id);
    }
}
