package interfaces;/* Created by Ponomarenko Oleh on 30/12/16. */

import model.User;

import java.util.LinkedList;
import java.util.List;

public interface Friends {

    default void friendship(int amountUser) throws InterruptedException {
        List<User> userList = new LinkedList<>();
        for (int i = 0; i < amountUser; i++) {
            User user = randomValidSignUp();
            userList.add(user);
            logout();
        }
        for (User user : userList) {
            System.out.println(user);
        }

        for (User user : userList) {
            signInByData(user.getEmail(), user.getPassword());
            for (User user1 : userList) {
                if (!user.getName().equals(user1.getName())) {
                    findUserByName(user1.getName());
                    sendRequestFriendship();
                    back();
                    back();
                }
            }
            logout();
        }
    }

    void acceptFriendship();

    void back();

    void logout() throws InterruptedException;

    void sendRequestFriendship();

    void findUserByName(String name) throws InterruptedException;

    void signInByData(String email, String password) throws InterruptedException;

    User randomValidSignUp() throws InterruptedException;

}
