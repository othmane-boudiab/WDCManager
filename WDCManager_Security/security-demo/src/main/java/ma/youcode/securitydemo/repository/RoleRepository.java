package ma.youcode.securitydemo.repository;

import ma.youcode.securitydemo.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
