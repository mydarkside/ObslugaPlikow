import java.util.*;

public class main {
    public static void main(String[] args) {

        CountsFromUser countsFromUser = new CountsFromUser();
        User user = new User();

        countsFromUser.doYouWantAddWelcome();
        countsFromUser.doYouWantAdd();
        user.addNameToFile();


    }
}
