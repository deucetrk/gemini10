package rc.bootsecurity.db;

import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import rc.bootsecurity.model.Astronomer;
import rc.bootsecurity.model.ScienceObserver;
import rc.bootsecurity.model.User;

import java.util.Arrays;
import java.util.List;

@Service
public class DbInit implements CommandLineRunner {
    private UserRepository userRepository;
    private PasswordEncoder passwordEncoder;

    public DbInit(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void run(String... args) {
        // Delete all
        this.userRepository.deleteAll();

        // Crete users
        User ddd = new User("ddd",passwordEncoder.encode("ddd123"),"USER","");
        User admin = new User("admin",passwordEncoder.encode("admin123"),"ADMIN","ACCESS_TEST1,ACCESS_TEST2");
        User manager = new User("manager",passwordEncoder.encode("manager123"),"MANAGER","ACCESS_TEST1");
        User astronomer = new Astronomer("astronomer",passwordEncoder.encode("astronomer123"),"ASTRONOMER","AS_1");
        User scienceObs = new ScienceObserver("scienceObs",passwordEncoder.encode("scienceObs123"),"SCIENCE_OBSERVER","SCOB_1");
        List<User> users = Arrays.asList(ddd,admin,manager,astronomer,scienceObs);

        // Save to db
        this.userRepository.saveAll(users);
    }
}
