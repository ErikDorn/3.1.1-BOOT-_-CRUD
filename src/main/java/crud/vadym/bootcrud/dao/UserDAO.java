package crud.vadym.bootcrud.dao;

import crud.vadym.bootcrud.model.User;


import java.util.List;

public interface UserDAO {
    List<User> allUsers();
    void save(User user);
    void delete(User user);
    User getById(Long id);
}
