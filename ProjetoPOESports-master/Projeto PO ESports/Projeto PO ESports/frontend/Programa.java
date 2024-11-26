package frontend;

import backend.Admin;
import backend.Jogadores;

public class Programa {
    public static void main(String[] args) {
        Admin admin = new Admin();
        Menus menus = new Menus();
        menus.MenuPrincipal();
    }
}
