public class Notebook {
    String surname;
    String name;
    String middleName;
    String nickname;
    String comment;
    GroupsEnum group;
    String phoneHome;
    String mobilePhone;
    String mobilePhoneSecond;
    String email;
    String skype;
    Address address;
    String notebookEntryDates;
    String datesOfTheLastModificationOfTheEntry;

    public Notebook(String surname, String name, String middleName, String nickname, String comment, GroupsEnum group, String phoneHome, String mobilePhone, String mobilePhoneSecond, String email, String skype, Address address, String notebookEntryDates, String datesOfTheLastModificationOfTheEntry) {
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.nickname = nickname;
        this.comment = comment;
        this.group = group;
        this.phoneHome = phoneHome;
        this.mobilePhone = mobilePhone;
        this.mobilePhoneSecond = mobilePhoneSecond;
        this.email = email;
        this.skype = skype;
        this.address = address;
        this.notebookEntryDates = notebookEntryDates;
        this.datesOfTheLastModificationOfTheEntry = datesOfTheLastModificationOfTheEntry;
    }

    @Override
    public String toString() {
        return "Surname: " + surname + '\n' +
                "Name: " + name + '\n' +
                "Middle name: " + middleName + '\n' +
                "Nickname: " + nickname + '\n' +
                "Comment: " + comment + '\n' +
                "Phone house: " + phoneHome + '\n' +
                "Mobile phone:" + mobilePhone + '\n' +
                "Mobile phone second: " + mobilePhoneSecond + '\n' +
                "E-mail: " + email + '\n' +
                "Skype: " + skype + '\n' +
                address.toString() +
                "Notebook entry dates: " + notebookEntryDates + '\n' +
                "Dates of the last modification of the entry: " + datesOfTheLastModificationOfTheEntry + '\n';
    }

    public String initialsToString() {
        return surname + " " +
                name.toCharArray()[0] + ".";
    }
}
