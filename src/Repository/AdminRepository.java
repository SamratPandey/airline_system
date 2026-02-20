package Repository;

import Entity.Admin;

public interface AdminRepository {
    Admin findByUsername(String username);
    Admin findByEmail(String email);
    Admin save(Admin admin);
    Admin findById(Long id);
    void delete(Admin admin);
}
