package com.forohub;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username); // Método para buscar un usuario por su nombre de usuario
}

