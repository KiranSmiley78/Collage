package com.tap.Entity;

import javax.swing.text.Document;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentProfile {
    @Id
    private Long userId;
    
    private String year;

    @OneToOne
    @MapsId
    @JoinColumn(name = "user_id")
    private User user;
}
