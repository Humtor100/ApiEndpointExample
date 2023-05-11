package main.java.com.example.apiendpointproject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String patientName;

    private LocalDateTime appointmentDateTime;
}

