package com.tap.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tap.Entity.StudentProfile;
import com.tap.repository.StudentProfileRepository;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentProfileRepository studentProfileRepository;

    @GetMapping("/profile/{id}")
    public ResponseEntity<StudentProfile> getStudentProfile(@PathVariable Long id) {
        return studentProfileRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
