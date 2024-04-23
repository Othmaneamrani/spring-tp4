package ma.tp2.tp3rep.security.service;

import jakarta.transaction.Transactional;
import ma.tp2.tp3rep.security.entities.AppRole;
import ma.tp2.tp3rep.security.entities.AppUser;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class AccountServiceImpl implements AccountService {
    @Override
    public AppUser addNewUser(String username, String password, String email, String confirmPassword) {
        
        return null;
    }

    @Override
    public AppRole addNewRole(String role) {
        return null;
    }

    @Override
    public void addRoleToUser(String username, String role) {

    }

    @Override
    public void removeRoleFromUser(String username, String role) {

    }
}
