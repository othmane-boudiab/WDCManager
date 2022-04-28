package ma.youcode.securitydemo.security.service;

import ma.youcode.securitydemo.entity.User;
import ma.youcode.securitydemo.repository.UserRepository;
import ma.youcode.securitydemo.security.UserPrincipal;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User u = userRepository.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException("username not found"));
        return new UserPrincipal(u);
    }
}
