package hw3Tests;

import hw3.User;
import hw3.UserRepository;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class UsersTests {
    @Test
    void testLogOutUsers(){
        User user1 = new User("user1", "111", false);
        User user2 = new User("user2", "222", false);
        User user3 = new User("user3", "333", true);

        UserRepository users = new UserRepository();
        users.addUser(user1);
        users.addUser(user2);
        users.addUser(user3);

        users.logOutUsers();
        assertThat(user1.isAuthenticate()).isFalse();
        assertThat(user3.isAuthenticate()).isTrue();

    }
}
