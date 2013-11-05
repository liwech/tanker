package io.tanker.web.security;

import io.tanker.dao.UserDaoMocked;
import io.tanker.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.Collections;

@Component("userDetailsService")
public class TankerUserDetailsService implements UserDetailsService {

    private final Logger log = LoggerFactory.getLogger(TankerUserDetailsService.class);

    @Autowired
    private UserDaoMocked userDao;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userDao.findUserByEmail(username);

        if (user == null) {
            throw new UsernameNotFoundException("User " + username + " not found");
        }

        return new TankerUserDetails(user.getId(), username, user.getPassword(), Collections.EMPTY_SET);
    }
}
