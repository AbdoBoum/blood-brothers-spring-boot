package com.bloodBrothers.AuthentificationService.Controllers;

import com.bloodBrothers.AuthentificationService.Services.CentreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;

public class AppAuthProvider extends DaoAuthenticationProvider {
    @Autowired
    CentreService centreService;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
//        return super.authenticate(authentication);
        UsernamePasswordAuthenticationToken auth = (UsernamePasswordAuthenticationToken) authentication;
        String name = auth.getName();
        String password = auth.getCredentials().toString();

        UserDetails centre = centreService.loadUserByUsername(name);

        if(centre == null){
            throw new BadCredentialsException("User/Password est incorect"+auth.getPrincipal());
        }

//        return new UsernamePasswordAuthenticationToken(centre , null, centre.getAuthorities());
        return new UsernamePasswordAuthenticationToken(centre,null, centre.getAuthorities());
    }

    @Override
    public boolean supports(Class<?> authentication) {
//        return super.supports(authentication);
        return true;
    }
}
