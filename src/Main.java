import com.company.Gender;
import com.company.model.User;
import com.company.service.UserService;
import com.company.service.impl.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
      

        User user1 = new User(1, "Kylymbek", 22, Gender.MAN);
        User user2 = new User(2, "Jas", 20, Gender.WOMAN);
        User user3 = new User(3, "Kylymbek", 25, Gender.MAN);

        UserService userService = new UserServiceImpl();
        userService.koshuu(user1);
        userService.koshuu(user2);
        userService.koshuu(user3);
        System.out.println("baardyk userler: ");
        userService.userlerdialuu();
        System.out.println("id menen aluu: ");
        userService.idMenenAluu(1);
        userService.idMenenOchuruu(2);
        System.out.println("baardyk userler: ");
        userService.userlerdialuu();
    }
}