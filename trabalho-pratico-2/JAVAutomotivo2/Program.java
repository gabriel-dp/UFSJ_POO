/*
 *  Pratical Work 2 - Object-Oriented-Programming
 *  Students - [ Gabriel de Paula Meira ]
 *  Professor - Matheus Viana
 */

import control.*;
import vision.*;

public class Program {
    public static void main(String[] args) {
        Data data = Data.createData();
        MenuHome app = new MenuHome(data);
        app.menu();
    }
}