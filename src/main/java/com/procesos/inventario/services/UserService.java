package com.procesos.inventario.services;

import com.procesos.inventario.models.User;
import com.procesos.inventario.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Column;
import java.util.Date;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRespository;

    public Optional getUser(Long id){
        return userRespository.findById(id);
    }
}
