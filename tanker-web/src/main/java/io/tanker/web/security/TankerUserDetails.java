package io.tanker.web.security;

import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

public class TankerUserDetails extends org.springframework.security.core.userdetails.User {

    private long id;

    public TankerUserDetails(long id, String username, String password, Collection<GrantedAuthority> authorities) {
        super(username, password, authorities);
        this.id = id;
    }

    public long getId() {
        return id;
    }

}