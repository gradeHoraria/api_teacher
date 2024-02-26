package com.example.api_teacher.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.api_teacher.dto.TeacherDTO;
import com.example.api_teacher.entity.Teacher;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class TeacherMapper {
    
    private final ModelMapper modelMapper;

    public Teacher execute(TeacherDTO teacherDTO) {
        return modelMapper.map(teacherDTO, Teacher.class);
    }

    public Teacher execute(Long id, TeacherDTO teacherDTO) {
        Teacher teacher = modelMapper.map(teacherDTO, Teacher.class);
        teacher.setId(id);
        return teacher;
    }
}
