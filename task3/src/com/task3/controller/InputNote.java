package com.task3.controller;

import com.task3.view.TextConstant;
import com.task3.view.View;

import java.util.Scanner;


public class InputNote {
    View view;
    ScanAndCheck scanAndCheck;
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
    String cityIndex;
    String city;
    String street;
    String homeNumber;
    String apartment;
    String notebookEntryDates;
    String datesOfTheLastModificationOfTheEntry;

    public InputNote(View view) {
        this.view = view;
        scanAndCheck = new ScanAndCheck(view, new Scanner(System.in));
    }

    public void addNewPerson() {
        String str = (String.valueOf(View.bundle.getLocale()).equals("ua"))
                ? RegexContainer.REGEX_SURNAME_UKR : RegexContainer.REGEX_SURNAME_LAT;
        this.surname =
                scanAndCheck.scanAndCheck
                        (TextConstant.SURNAME, str);
        str = (String.valueOf(View.bundle.getLocale()).equals("ua"))
                ? RegexContainer.REGEX_NAME_UKR : RegexContainer.REGEX_NAME_LAT;
        this.name =
                scanAndCheck.scanAndCheck
                        (TextConstant.NAME, str);
        str = (String.valueOf(View.bundle.getLocale()).equals("ua"))
                ? RegexContainer.REGEX_MIDDLE_NAME_UKR : RegexContainer.REGEX_MIDDLE_NAME_LAT;
        this.middleName =
                scanAndCheck.scanAndCheck
                        (TextConstant.MIDDLE_NAME, str);
        this.nickname =
                scanAndCheck.scanAndCheck
                        (TextConstant.NICKNAME, RegexContainer.REGEX_NICKNAME);
        this.comment =
                scanAndCheck.scanAndCheck
                        (TextConstant.COMMENT, RegexContainer.REGEX_COMMENT);
        this.group =
                GroupsEnum.valueOf
                        (scanAndCheck.scanAndCheck
                                (TextConstant.GROUP, RegexContainer.REGEX_GROUP));
        this.phoneHome =
                scanAndCheck.scanAndCheck
                        (TextConstant.PHONE_HOME, RegexContainer.REGEX_PHONE_HOME);
        this.mobilePhone =
                scanAndCheck.scanAndCheck
                        (TextConstant.MOBILE_PHONE, RegexContainer.REGEX_MOBILE_PHONE);
        this.mobilePhoneSecond =
                scanAndCheck.scanAndCheck
                        (TextConstant.SECOND_MOBILE_PHONE, RegexContainer.REGEX_SECOND_MOBILE_PHONE);
        this.email =
                scanAndCheck.scanAndCheck
                        (TextConstant.EMAIL, RegexContainer.REGEX_EMAIL);
        this.skype =
                scanAndCheck.scanAndCheck
                        (TextConstant.SKYPE, RegexContainer.REGEX_SKYPE);
        this.cityIndex =
                scanAndCheck.scanAndCheck
                        (TextConstant.CITY_INDEX, RegexContainer.REGEX_CITY_INDEX);
        str = (String.valueOf(View.bundle.getLocale()).equals("ua"))
                ? RegexContainer.REGEX_CITY_UKR : RegexContainer.REGEX_CITY_LAT;
        this.city =
                scanAndCheck.scanAndCheck
                        (TextConstant.CITY, str);
        str = (String.valueOf(View.bundle.getLocale()).equals("ua"))
                ? RegexContainer.REGEX_STREET_UKR : RegexContainer.REGEX_STREET_LAT;
        this.street =
                scanAndCheck.scanAndCheck
                        (TextConstant.STREET, str);
        this.homeNumber =
                scanAndCheck.scanAndCheck
                        (TextConstant.HOME_NUMBER, RegexContainer.REGEX_HOME_NUMBER);
        this.apartment =
                scanAndCheck.scanAndCheck
                        (TextConstant.APARTMENT, RegexContainer.REGEX_APARTMENT);
        this.notebookEntryDates =
                scanAndCheck.scanAndCheck
                        (TextConstant.NOTEBOOK_ENTRY_DATES, RegexContainer.REGEX_NOTEBOOK_ENTRY_DATES);
        this.datesOfTheLastModificationOfTheEntry =
                scanAndCheck.scanAndCheck
                        (TextConstant.DATES_OF_THE_LAST_MODIFICATION_OF_THE_ENTRY, RegexContainer.REGEX_DATES_OF_THE_LAST_MODIFICATION_OF_THE_ENTRY);
    }
}
