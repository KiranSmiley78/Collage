package com.tap.service;



import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import com.tap.Entity.StudentProfile;
import com.tap.repository.StudentProfileRepository;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentProfileRepository studentProfileRepository = null;

    public Optional<StudentProfile> findProfileById(Long id) {
        return studentProfileRepository.findById(id);
    }
}
