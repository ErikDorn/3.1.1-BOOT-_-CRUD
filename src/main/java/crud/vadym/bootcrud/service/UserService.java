package crud.vadym.bootcrud.service;

import crud.vadym.bootcrud.model.User;

import java.util.List;

public interface UserService {
    List<User> allUsers();
    void save(User user);
    void delete(User user);
    User getById(Long id);
}
