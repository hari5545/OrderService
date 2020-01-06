package srit.rhes.api.repositery;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import srit.rhes.api.model.User;

@Repository
public interface UserRepositery extends JpaRepository<User,Integer>{

    User findByUserName(String userName);
}
