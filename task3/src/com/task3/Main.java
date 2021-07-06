package com.task3;

import com.task3.model.Model;
import com.task3.view.View;
import com.task3.controller.Controller;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller(new Model(), new View());
        controller.userProcess();
    }
}
