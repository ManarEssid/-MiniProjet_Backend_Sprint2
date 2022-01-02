package com.manar.users.service;

import com.manar.users.entities.Role;
import com.manar.users.entities.User;

public interface UserService {
User saveUser(User user);
User findUserByUsername (String username);
Role addRole(Role role);
User addRoleToUser(String username, String rolename);
}
