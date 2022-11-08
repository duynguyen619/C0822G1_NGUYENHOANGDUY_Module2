package bai_mau.Quan_Ly_Nhan_Su.service;

import java.io.IOException;

public interface IStudent {
    void addStudent() throws IOException;
    void displayAllStudent();
    void removeStudent() throws IOException;
    void search();
    void editStudent() throws IOException;
}
