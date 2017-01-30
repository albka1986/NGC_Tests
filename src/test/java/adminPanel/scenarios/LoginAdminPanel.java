package adminPanel.scenarios;

import adminPanel.pages.LoginPage;
import adminPanel.pages.Toolbar;

public class LoginAdminPanel {

    public void loginByData(String username, String password) throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        loginPage.loginByData(username, password);
    }

    public void loginByDefaultData() {
        LoginPage loginPage = new LoginPage();
        loginPage.loginByDefaultData();
    }

    public void logout() {
        Toolbar toolbar = new Toolbar();
        toolbar.logout();
    }
}
