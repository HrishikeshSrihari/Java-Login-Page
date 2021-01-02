public class Main {
    public static void main(String args[]) {
        IDPW idpws = new IDPW();

        LoginPage loginPage = new LoginPage(idpws.getLoginInfo());

    }
}
