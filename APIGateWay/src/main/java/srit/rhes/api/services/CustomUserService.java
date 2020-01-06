package srit.rhes.api.services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import srit.rhes.api.model.CustomUserDetails;
import srit.rhes.api.model.User;
import srit.rhes.api.repositery.UserRepositery;

@Service
public class CustomUserService implements UserDetailsService{
	
	@Autowired(required = false)
	private UserRepositery userRepositery;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user=userRepositery.findByUserName(username);
		CustomUserDetails customUserDetails=null;
		if(user!=null) {
			customUserDetails=new CustomUserDetails(user);	
			System.out.println(user);
		}else {
			throw new UsernameNotFoundException("invalid username and password");
		}
		return customUserDetails;

	}
}