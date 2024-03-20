package hu.flow.user;

import hu.flow.user.model.Rights;
import hu.flow.user.model.Users;
import hu.flow.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class UserApplication {

	@Autowired
	private UserRepository userRepository;

    public static void main(String[] args) {
		SpringApplication.run(UserApplication.class, args);
	}

//    @Bean
//    public CommandLineRunner runner() {
//        return args -> {
//			Users users = new Users("Feri", "Ferkó", Rights.USER,58);
//			userRepository.save(users);
//        };
//    }
}
