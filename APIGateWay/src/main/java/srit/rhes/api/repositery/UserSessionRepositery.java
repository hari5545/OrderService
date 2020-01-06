package srit.rhes.api.repositery;

import org.springframework.data.jpa.repository.JpaRepository;

import srit.rhes.api.model.UserSession;

public interface UserSessionRepositery extends JpaRepository<UserSession, Integer>{
	UserSession findBysessionId(String sessionId);
}
