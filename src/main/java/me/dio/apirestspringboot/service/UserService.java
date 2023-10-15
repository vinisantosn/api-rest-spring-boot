package me.dio.apirestspringboot.service;

import me.dio.apirestspringboot.domain.model.User;

public interface UserService {
    User findById(Long id);
    User create(User userToCreate);
}
