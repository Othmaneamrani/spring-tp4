package ma.tp2.tp3rep.security.repos;

import ma.tp2.tp3rep.security.entities.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppRoleRepository extends JpaRepository<AppRole,String > {
}
