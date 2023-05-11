package main.java.com.example.apiendpointproject.service;

public interface AppointmentService {
    List<Appointment> getAllAppointments();

    Appointment getAppointmentById(Long id);

    Appointment createAppointment(Appointment appointment);

    Appointment updateAppointment(Long id, Appointment appointment);

    void deleteAppointment(Long id);
}

