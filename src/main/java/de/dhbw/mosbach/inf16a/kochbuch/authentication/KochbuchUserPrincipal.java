package de.dhbw.mosbach.inf16a.kochbuch.authentication;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

/**
 * @author Patrick Hahn
 * @author Armin Beck
 * @author Leandro Späth
 */


public class KochbuchUserPrincipal implements UserDetails
{
	private final User user;

	public KochbuchUserPrincipal(User user)
	{
		this.user = user;
	}

	public User getUser()
	{
		return user;
	}

	@Override
	public boolean isEnabled()
	{
		return true;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities()
	{
		return null;
	}

	@Override
	public String getPassword()
	{
		return user.getPassword();
	}

	@Override
	public String getUsername()
	{
		return user.getUsername();
	}

	@Override
	public boolean isAccountNonExpired()
	{
		return true;
	}

	@Override
	public boolean isAccountNonLocked()
	{
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired()
	{
		return true;
	}
}