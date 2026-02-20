package Repository;

import Entity.User;

public interface UserRepository {
    User findByEmail(String email);
    User save(User user);
    User findById(Long id);
    void delete(User user);
}

