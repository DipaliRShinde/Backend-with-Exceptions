package com.stackroute.authenticationserver.service;

import com.stackroute.authenticationserver.exceptions.UserNotExistsException;
import com.stackroute.authenticationserver.model.User;

public interface UserService {

    User getUserByUsername(String username) throws UserNotExistsException;
}
