package com.bloodBrothers.AuthentificationService.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Collection;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Centre implements UserDetails {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    
    @Column(name = "nom_centre")
    private String nomCentre;

    private String telephoneCentre;

    private String emailCentre;

    private String passwordCentre;

    private String adresseCentre;

    private long idVilleCentre;

    public Centre(@NotBlank String nomCentre, @NotBlank String telephoneCentre, @NotBlank String emailCentre, @NotBlank String passwordCentre, @NotBlank String adresseCentre, @NotBlank long idVilleCentre) {
        this.nomCentre = nomCentre;
        this.telephoneCentre = telephoneCentre;
        this.emailCentre = emailCentre;
        this.passwordCentre = passwordCentre;
        this.adresseCentre = adresseCentre;
        this.idVilleCentre = idVilleCentre;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return this.passwordCentre;
    }

    @Override
    public String getUsername() {
        return this.nomCentre;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}