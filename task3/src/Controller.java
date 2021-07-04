import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Controller {
    Model model;
    View view;

    final String REGEX_SURNAME = "[A-Z][a-z]{4,65}";
    final String REGEX_NAME = "[A-Z][a-z]{2,35}";
    final String REGEX_MIDDLE_NAME = "[A-Z][a-z]{4,35}";
    final String REGEX_NICKNAME = "^[^!?=_\\- 0-9][^-= ]+$";
    final String REGEX_COMMENT = ".{1,180}";
    final String REGEX_GROUP = "^IA9[1,2,3,4]";
    final String REGEX_PHONE_HOME = "^[0-9]{6}$";
    final String REGEX_MOBILE_PHONE = "^\\+380[0-9]{9}$";
    final String REGEX_SECOND_MOBILE_PHONE = "^(\\+380[0-9]{9})?$";
    final String REGEX_EMAIL = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
    final String REGEX_SKYPE = "^[^!?=_\\- 0-9][^-= ]+$";
    final String REGEX_CITY_INDEX = "^[0-9]{5}$";
    final String REGEX_CITY = "[A-Z][a-z]{4,30}";
    final String REGEX_STREET = "[A-Za-z ]+$";
    final String REGEX_HOME_NUMBER = "^[1-9][0-9]{1,4}$";
    final String REGEX_APARTMENT = "^[1-9][0-9]{1,4}$";
    final String REGEX_NOTEBOOK_ENTRY_DATES = "^[0-3]?[0-9].[0-3]?[0-9].(?:[0-9]{2})?[0-9]{2}$";
    final String REGEX_DATES_OF_THE_LAST_MODIFICATION_OF_THE_ENTRY = "^[0-3]?[0-9].[0-3]?[0-9].(?:[0-9]{2})?[0-9]{2}$";

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void userProcess() {
        view.message(view.ENTERING_MESSAGE);
        model.addToNotebookNewPerson(addNewPerson());
    }

    private String scanAndCheck(String message, String regex) {
        Scanner sc = new Scanner(System.in);
        boolean check = false;
        String input = "-1";
        while (!check) {
            view.message(message);
            input = sc.nextLine();
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(input);
            check = m.matches();
        }
        return input;
    }

    private Notebook addNewPerson() {
        String surname = scanAndCheck("Enter surname: ", REGEX_SURNAME);
        String name = scanAndCheck("Enter name: ", REGEX_NAME);
        String middleName = scanAndCheck("Enter middle name: ", REGEX_MIDDLE_NAME);
        String nickname = scanAndCheck("Enter nickname: ", REGEX_NICKNAME);
        String comment = scanAndCheck("Enter comment: ", REGEX_COMMENT);
        GroupsEnum group = GroupsEnum.valueOf(scanAndCheck("Enter group(IA91, IA92, IA93, IA94): ", REGEX_GROUP));
        String phoneHome = scanAndCheck("Enter phone home: ", REGEX_PHONE_HOME);
        String mobilePhone = scanAndCheck("Enter mobile phone: ", REGEX_MOBILE_PHONE);
        String mobilePhoneSecond = scanAndCheck("Enter second mobile phone: ", REGEX_SECOND_MOBILE_PHONE);
        String email = scanAndCheck("Enter email: ", REGEX_EMAIL);
        String skype = scanAndCheck("Enter skype: ", REGEX_SKYPE);
        String cityIndex = scanAndCheck("Enter city index: ", REGEX_CITY_INDEX);
        String city = scanAndCheck("Enter city: ", REGEX_CITY);
        String street = scanAndCheck("Enter street: ", REGEX_STREET);
        String homeNumber = scanAndCheck("Enter home number: ", REGEX_HOME_NUMBER);
        String apartment = scanAndCheck("Enter apartment: ", REGEX_APARTMENT);
        String notebookEntryDates = scanAndCheck("Enter notebook entry dates: ", REGEX_NOTEBOOK_ENTRY_DATES);
        String datesOfTheLastModificationOfTheEntry = scanAndCheck("Enter dates of the last modification of the entry: ", REGEX_DATES_OF_THE_LAST_MODIFICATION_OF_THE_ENTRY);
        return new Notebook(surname, name, middleName, nickname, comment, group, phoneHome, mobilePhone, mobilePhoneSecond, email, skype, new Address(cityIndex, city, street, homeNumber, apartment), notebookEntryDates, datesOfTheLastModificationOfTheEntry);
    }
}
