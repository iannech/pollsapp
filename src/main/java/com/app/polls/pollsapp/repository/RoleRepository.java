package com.app.polls.pollsapp.repository;

import com.app.polls.pollsapp.com.app.polls.pollsapp.model.Role;
import com.app.polls.pollsapp.com.app.polls.pollsapp.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}
