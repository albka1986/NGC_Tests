package adminPanel.scenarios;

import adminPanel.pages.DrawerPage;
import adminPanel.pages.LoginPage;

public class DrawerAdminPanel {

    DrawerPage drawerPage = new DrawerPage();

    public void testOpenCloseDrawer() {
        new LoginPage().loginByDefaultData();
        drawerPage.openDrawer();
        drawerPage.closeDrawer();
        drawerPage.openDrawer();
        drawerPage.closeDrawer();

    }


}
