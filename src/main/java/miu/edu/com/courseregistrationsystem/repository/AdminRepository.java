package miu.edu.com.courseregistrationsystem.repository;

import miu.edu.com.courseregistrationsystem.domain.Admin;
import miu.edu.com.courseregistrationsystem.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface AdminRepository extends JpaRepository<Admin, Integer> {
}
