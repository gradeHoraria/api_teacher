package com.example.api_teacher.teachers.createTeacher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.api_teacher.dto.TeacherDTO;
import com.example.api_teacher.mapper.TeacherMapper;
import com.example.api_teacher.repository.TeacherRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class CreateTeacherService {

    private final TeacherRepository teacherRepository;
    private final TeacherMapper teacherMapper;

    public void execute(TeacherDTO teacherDTO) {
        teacherRepository.save(teacherMapper.execute(teacherDTO));
    }
}
