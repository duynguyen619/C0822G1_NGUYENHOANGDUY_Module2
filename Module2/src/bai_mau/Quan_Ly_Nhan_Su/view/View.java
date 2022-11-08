package bai_mau.Quan_Ly_Nhan_Su.view;

import bai_mau.Quan_Ly_Nhan_Su.controller.PersonnelController;

import java.io.IOException;

public class View {
    public static void main(String[] args) throws IOException {
        PersonnelController personnelController =new PersonnelController();
        personnelController.menuManagement();
    }
}
