package com.onlinebanking.service;

import java.util.List;

import com.onlinebanking.entity.Appointment;


public interface AppointmentService {

    Appointment createAppointment(Appointment appointment);

    List<Appointment> findAll();

    Appointment findAppointment(Long id);

    void confirmAppointment(Long id);
}