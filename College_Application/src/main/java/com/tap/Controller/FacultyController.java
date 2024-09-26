package com.tap.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tap.Entity.FacultyProfile;
import com.tap.repository.FacultyProfileRepository;

@RestController
@RequestMapping("/faculty")
public class FacultyController {
    @Autowired
    private FacultyProfileRepository facultyProfileRepository;

    @GetMapping("/profile/{id}")
    public ResponseEntity<FacultyProfile> getFacultyProfile(@PathVariable Long id) {
        return facultyProfileRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
