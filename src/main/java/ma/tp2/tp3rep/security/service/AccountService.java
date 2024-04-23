package ma.tp2.tp3rep.security.service;

import ma.tp2.tp3rep.security.entities.AppRole;
import ma.tp2.tp3rep.security.entities.AppUser;

public interface AccountService {
    AppUser addNewUser(String username, String password, String email,String confirmPassword);
    AppRole addNewRole(String role);
    void addRoleToUser(String username,String role);
    void removeRoleFromUser(String username, String role);

}
