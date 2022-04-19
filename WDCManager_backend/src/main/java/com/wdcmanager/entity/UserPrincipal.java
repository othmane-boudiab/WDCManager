//package com.wdcmanager.entity;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.List;
//
//@RequiredArgsConstructor
//public class UserPrincipal implements UserDetails {
//    @Autowired
//    private Utilisateur utilisateur;
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
////        List<GrantedAuthority> authorities = new ArrayList<>();
////        authorities.add(new SimpleGrantedAuthority("ROLE_"+utilisateur.getRole().getRole()));
//        SimpleGrantedAuthority authority = new SimpleGrantedAuthority("ROLE_"+utilisateur.getRole().getRole());
//        return List.of(authority);
////        return authorities;
//    }
//
//    @Override
//    public String getPassword() {
//        return utilisateur.getPassword();
//    }
//
//    @Override
//    public String getUsername() {
//        return utilisateur.getEmail();
//    }
//
//    @Override
//    public boolean isAccountNonExpired() {
//        return false;
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
//        return false;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return false;
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return utilisateur.getEtat()==1;
//    }
//}
