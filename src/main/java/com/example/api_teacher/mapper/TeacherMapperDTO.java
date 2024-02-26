package com.example.api_teacher.mapper;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.api_teacher.dto.TeacherDTO;
import com.example.api_teacher.entity.Teacher;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class TeacherMapperDTO {

    private final ModelMapper modelMapper;

    public TeacherDTO execute(Teacher teacher) {
        return modelMapper.map(teacher, TeacherDTO.class);
    }
    
    public List<TeacherDTO> execute(List<Teacher> teachers) {
        return teachers.stream().map(teacher -> execute(teacher)).toList();
    }
}
