package io.tanker.web.security;

import io.tanker.dao.UserDaoMocked;
import io.tanker.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    @Autowired
    private UserDaoMocked userDao;

    public long getCurrentUserId() {
        SecurityContext securityContext = SecurityContextHolder.getContext();
        return ((TankerUserDetails) securityContext.getAuthentication().getPrincipal()).getId();
    }

    public User getCurrentUser() {
        SecurityContext securityContext = SecurityContextHolder.getContext();
        UserDetails springSecurityUser = (UserDetails) securityContext.getAuthentication().getPrincipal();

        return userDao.findUserByEmail(springSecurityUser.getUsername());
    }

    public boolean isAuthenticated() {
        SecurityContext securityContext = SecurityContextHolder.getContext();
        return (securityContext.getAuthentication() != null);
    }
}