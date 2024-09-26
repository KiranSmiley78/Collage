package com.tap.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FacultyProfile {
    @Id
    private Long userId;
    
    private String officeHours;

    @OneToOne
    @MapsId
    @JoinColumn(name = "user_id")
    private User user;
}
