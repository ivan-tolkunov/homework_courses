package com.task3.controller;

public interface RegexContainer {
    // Regex
    // "Tolkunov"
    String REGEX_SURNAME_LAT = "[A-Z][a-z]{4,65}";
    // "Ivan"
    String REGEX_NAME_LAT = "[A-Z][a-z]{2,35}";
    // "Sergeevich"
    String REGEX_MIDDLE_NAME_LAT = "[A-Z][a-z]{4,35}";
    // "Толкунов"
    String REGEX_SURNAME_UKR = "^[А-ЩЬЮЯҐІЇЄ][а-щьюяґіїє']{4,65}$";
    // "Iван"
    String REGEX_NAME_UKR = "^[А-ЩЬЮЯҐІЇЄ][а-щьюяґіїє']{2,35}$";
    // "Сергійович"
    String REGEX_MIDDLE_NAME_UKR = "^[А-ЩЬЮЯҐІЇЄ][а-щьюяґіїє']{4,35}$";
    // "zxcubika"
    String REGEX_NICKNAME = "^[^!?=_\\- 0-9][^-= ]+$";
    // "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."
    String REGEX_COMMENT = ".{1,180}";
    // "IA91"
    String REGEX_GROUP = "^IA9[1,2,3,4]";
    // "653420"
    String REGEX_PHONE_HOME = "^[0-9]{6}$";
    // "+380638693921"
    String REGEX_MOBILE_PHONE = "^\\+380[0-9]{9}$";
    // "+380638693921" or ""
    String REGEX_SECOND_MOBILE_PHONE = "^(\\+380[0-9]{9})?$";
    // "text@gmail.com"
    String REGEX_EMAIL = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
    // "zxcubika"
    String REGEX_SKYPE = "^[^!?=_\\- 0-9][^-= ]+$";
    // "08401"
    String REGEX_CITY_INDEX = "^[0-9]{5}$";
    // "Kiev"
    String REGEX_CITY_LAT = "[A-Z][a-z]{4,30}";
    // "Golovatogo"
    String REGEX_STREET_LAT = "[A-Za-z ]+$";
    // "Київ"
    String REGEX_CITY_UKR = "^[А-ЩЬЮЯҐІЇЄ][а-щьюяґіїє']{4,30}";
    // "Головатого"
    String REGEX_STREET_UKR = "^[А-ЩЬЮЯҐІЇЄ][а-щьюяґіїє' ]+$";
    // "43"
    String REGEX_HOME_NUMBER = "^[1-9][0-9]{1,4}$";
    // "221"
    String REGEX_APARTMENT = "^[1-9][0-9]{1,4}$";
    // "04.05.2021"
    String REGEX_NOTEBOOK_ENTRY_DATES = "^[0-3]?[0-9].[0-3]?[0-9].(?:[0-9]{2})?[0-9]{2}$";
    // "24.05.2021"
    String REGEX_DATES_OF_THE_LAST_MODIFICATION_OF_THE_ENTRY = "^[0-3]?[0-9].[0-3]?[0-9].(?:[0-9]{2})?[0-9]{2}$";
}
