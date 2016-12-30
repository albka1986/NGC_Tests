package interfaces;/* Created by Ponomarenko Oleh on 30/12/16. */

import model.User;

import java.util.LinkedList;
import java.util.List;

public interface Friends {

    default void friendship() {
        List<User> userList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            User user = randomValidSignUp();
            userList.add(user);

        }
        for (User user : userList) {
            signInByData(user.getEmail(), user.getPassword());
            for (User user1 : userList) {
                if (!user.getName().equals(user1.getName())) {
                    findUserByName(user1.getName());
                    sendRequestFriendship();
                }
            }

        }

    }


    void sendRequestFriendship();

    void findUserByName(String name);

    void signInByData(String email, String password);

    User randomValidSignUp();

}
