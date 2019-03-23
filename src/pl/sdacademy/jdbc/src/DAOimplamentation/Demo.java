package pl.sdacademy.jdbc.src.DAOimplamentation;

import DAOimplamentation.DAOs.EmployeeDAO;
import DAOimplamentation.Entities.Emploee;

public class Demo {
    public static void main(String[] args) {
        Emploee emploee=new Emploee(1111,"Kuba","Testowy", 12);
        EmployeeDAO dao =new EmployeeDAO();
        dao.delete(emploee);
    }
}
