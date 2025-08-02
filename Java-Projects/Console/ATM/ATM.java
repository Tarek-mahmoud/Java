package ATM;

import java.io.IOException;

public class ATM extends OptionMenu {
    public static void main(String[] args) throws IOException {

        OptionMenu optionMenu = new ATM();

        optionMenu.getLogin();
    }
}
