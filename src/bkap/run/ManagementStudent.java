package bkap.run;

import bkap.entity.Student;

/**
 * ManagementStudent
 */
public class ManagementStudent {

    public static void main(String[] args) {
        // Khoi tao student1
        Student student1 = new Student();
        student1.inputData();

        // Hien thi thong tin student1 bang phuong thuc
        // displayData()
        student1.displayData();
    }
}