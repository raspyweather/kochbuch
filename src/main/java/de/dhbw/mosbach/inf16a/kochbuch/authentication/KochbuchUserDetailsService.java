package de.dhbw.mosbach.inf16a.kochbuch.authentication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class KochbuchUserDetailsService implements UserDetailsService
{
	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException
	{
		System.out.println("userdetailsservice " + username);
		return new KochbuchUserPrincipal(
				userRepository
						.findByUsername(username)
						.orElseThrow(() -> new UsernameNotFoundException(username))
		);
	}
}