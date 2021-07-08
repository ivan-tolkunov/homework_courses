package com.company;

import com.company.controller.Controller;
import com.company.model.Model;
import com.company.model.entity.DBNoteBook;
import com.company.view.View;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Controller controller =
                new Controller(new Model(new DBNoteBook()), new View());
        // Run
        controller.processUser();
    }
}
