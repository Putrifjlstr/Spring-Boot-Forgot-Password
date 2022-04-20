package id.ac.uin.student.forgot.password.repository;

import id.ac.uin.student.forgot.password.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
