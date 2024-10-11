package com.virtueaina.authservice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    /**
     *
     * @param
     * @return
     */
    public User findByUsername(String username);
    public void delete(Long id);


}


