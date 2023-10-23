//package com.packt.cardatabase;
//
//import java.util.Arrays;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.AuthenticationProvider;
//import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
//import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//import org.springframework.web.cors.CorsConfiguration;
//import org.springframework.web.cors.CorsConfigurationSource;
//import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
//
//import com.packt.cardatabase.service.JwtService;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig {
//	
//	@Autowired
//	private UserDetailsService uds;
//	
//	@Autowired
//	private AuthenticationFilter authenticationFilter;
//	
//	@Autowired
//	private AuthEntryPoint exceptionHandler;
//	
//	@Bean
//	CorsConfigurationSource corsConfigurationSource() {
//		
//		UrlBasedCorsConfigurationSource source =
//				new UrlBasedCorsConfigurationSource();
//		CorsConfiguration config = new CorsConfiguration();
//		config.setAllowedOrigins(Arrays.asList("*"));
//		config.setAllowedMethods(Arrays.asList("*"));
//		config.setAllowedHeaders(Arrays.asList("*"));
//		config.setAllowCredentials(false);
//		config.applyPermitDefaultValues();
//		
//		source.registerCorsConfiguration("/**", config);
//		return source;
//		
//		
//	}
//	
//
//	
//	
//	@Bean
//	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//		http.csrf(AbstractHttpConfigurer::disable)
//		.cors(cors -> cors.configurationSource(corsConfigurationSource()))
//		.sessionManagement(manager -> manager.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
//		.authorizeHttpRequests( request -> request.requestMatchers(HttpMethod.POST, "/login").permitAll().anyRequest().authenticated())
//		.authenticationProvider(authenticationProvider()).addFilterBefore(authenticationFilter, UsernamePasswordAuthenticationFilter.class)
//		.exceptionHandling((exception) -> exception.authenticationEntryPoint(exceptionHandler));
//		return http.build();
//	}
//	
//	@Bean
//	public AuthenticationProvider authenticationProvider() {
//		DaoAuthenticationProvider authenticationProvider = new DaoAuthenticationProvider();
//		authenticationProvider.setUserDetailsService(uds);
//		authenticationProvider.setPasswordEncoder(new BCryptPasswordEncoder());
//		return authenticationProvider;
//	}
//	
//	@Bean
//	public AuthenticationManager authenticationManager(AuthenticationConfiguration config) throws Exception {
//		return config.getAuthenticationManager();
//	}
//
//}
