import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Controller {

    // Regex
    // "Tolkunov"
    public static final String REGEX_SURNAME = "[A-Z][a-z]{4,65}";
    // "Ivan"
    public static final String REGEX_NAME = "[A-Z][a-z]{2,35}";
    // "Sergeevich"
    public static final String REGEX_MIDDLE_NAME = "[A-Z][a-z]{4,35}";
    // "zxcubika"
    public static final String REGEX_NICKNAME = "^[^!?=_\\- 0-9][^-= ]+$";
    // "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."
    public static final String REGEX_COMMENT = ".{1,180}";
    // "IA91"
    public static final String REGEX_GROUP = "^IA9[1,2,3,4]";
    // "653420"
    public static final String REGEX_PHONE_HOME = "^[0-9]{6}$";
    // "+380638693921"
    public static final String REGEX_MOBILE_PHONE = "^\\+380[0-9]{9}$";
    // "+380638693921" or ""
    public static final String REGEX_SECOND_MOBILE_PHONE = "^(\\+380[0-9]{9})?$";
    // "text@gmail.com"
    public static final String REGEX_EMAIL = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
    // "zxcubika"
    public static final String REGEX_SKYPE = "^[^!?=_\\- 0-9][^-= ]+$";
    // "08401"
    public static final String REGEX_CITY_INDEX = "^[0-9]{5}$";
    // "Kiev"
    public static final String REGEX_CITY = "[A-Z][a-z]{4,30}";
    // "Golovatogo"
    public static final String REGEX_STREET = "[A-Za-z ]+$";
    // "43"
    public static final String REGEX_HOME_NUMBER = "^[1-9][0-9]{1,4}$";
    // "221"
    public static final String REGEX_APARTMENT = "^[1-9][0-9]{1,4}$";
    // "04.05.2021"
    public static final String REGEX_NOTEBOOK_ENTRY_DATES = "^[0-3]?[0-9].[0-3]?[0-9].(?:[0-9]{2})?[0-9]{2}$";
    // "24.05.2021"
    public static final String REGEX_DATES_OF_THE_LAST_MODIFICATION_OF_THE_ENTRY = "^[0-3]?[0-9].[0-3]?[0-9].(?:[0-9]{2})?[0-9]{2}$";

    // Constructor
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    // The work method
    public void userProcess() {
        view.message(view.ENTERING_MESSAGE);
        model.addToNotebookNewPerson(addNewPerson());
    }

    /**
     * Returns a String in correct form.
     * The user's input must be in normal form.
     *
     * @param message an message to a user
     * @param regex   filter for input text
     * @return correct text
     * @see String
     */
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

    // Utility method
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
