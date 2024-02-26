package com.example.api_teacher.teachers.listTeacher;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.api_teacher.dto.TeacherDTO;
import com.example.api_teacher.mapper.TeacherMapperDTO;
import com.example.api_teacher.repository.TeacherRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class ListTeacherService {

    private final TeacherRepository teacherRepository;
    private final TeacherMapperDTO teacherMapperDTO;

    public List<TeacherDTO> execute() {
        return teacherMapperDTO.execute(teacherRepository.findAll());
    }
}
