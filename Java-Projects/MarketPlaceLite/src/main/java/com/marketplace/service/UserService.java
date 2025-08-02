package com.marketplace.service;

import com.marketplace.dto.RegisterRequest;
import com.marketplace.entity.User;
import com.marketplace.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository repo;
    private final PasswordEncoder encoder;

    public UserService(UserRepository repo, PasswordEncoder encoder) {
        this.repo = repo;
        this.encoder = encoder;
    }

    public void register(RegisterRequest request) {
        User user = new User();
        user.setUsername(request.getUsername());
        user.setPassword(encoder.encode(request.getPassword()));
        repo.save(user);
    }
}