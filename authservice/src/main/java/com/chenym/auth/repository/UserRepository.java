package com.chenym.auth.repository;

import com.chenym.auth.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by chenym on 2017/9/15.
 */
@Repository
public interface UserRepository extends CrudRepository<User, String> {

    User findByUsername(String username);
}
