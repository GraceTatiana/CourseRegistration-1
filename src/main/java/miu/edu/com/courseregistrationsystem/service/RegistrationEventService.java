package miu.edu.com.courseregistrationsystem.service;

import miu.edu.com.courseregistrationsystem.domain.RegistrationEvent;
import miu.edu.com.courseregistrationsystem.domain.RegistrationGroup;
import miu.edu.com.courseregistrationsystem.domain.RegistrationStatus;

import java.util.List;
import java.util.Optional;

public interface RegistrationEventService {
    RegistrationEvent getRegistrationEvent(Integer id);
    RegistrationEvent save(RegistrationEvent registrationEvent);
    List<RegistrationEvent> getAllRegistrationEvent();
    void delete(Integer id);
    RegistrationEvent addRegGroup(int event_id,int group_id);
    void updateStatus(int id,RegistrationStatus status);

    Optional<RegistrationEvent> latestOne();

    Optional<RegistrationEvent> findByStudentId(int id);
}
