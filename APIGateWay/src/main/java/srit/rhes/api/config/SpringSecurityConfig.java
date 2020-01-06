package srit.rhes.api.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;

import srit.rhes.api.services.CustomUserService;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter{

	@Autowired
	private CustomUserService userDetailsService;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		/*
		 * auth.inMemoryAuthentication().withUser("hari").password("{noop}hari").roles("ADMIN");
		 */
		auth
		.userDetailsService(userDetailsService)
		.passwordEncoder(passwordEncoder());
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable();
		http
		.authorizeRequests()
		.antMatchers("/resources/**", "/WEB-INF/jsp/*").permitAll()
		.anyRequest().authenticated()
		.and()
		.formLogin()
		.loginPage("/login")
		.defaultSuccessUrl("/welcome", true)
		.failureForwardUrl("/login?error")
		.permitAll()
		.and()
		.logout()
		.invalidateHttpSession(true)
		.deleteCookies("JSESSIONID")
		.permitAll();
		/*
		 * .authorizeRequests() .antMatchers("/auth/**") .authenticated() .anyRequest()
		 * .permitAll() .and() .formLogin() .loginPage("/login")
		 * .defaultSuccessUrl("/welcome") .failureUrl("/login") .permitAll();
		 */
	}

	private PasswordEncoder passwordEncoder() {
		return new PasswordEncoder() {
			@Override
			public String encode(CharSequence charSequence) {
				return charSequence.toString();
			}
			@Override
			public boolean matches(CharSequence charSequence, String s) {
				return true;
			}
		};
	}

}