package pl.sdacademy.jdbc.src.test;

import DAOimplamentation.DAOs.EmployeeDAO;
import DAOimplamentation.Entities.Emploee;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

import java.util.List;

public class EmploeeDAOTests {

    @Test
    public void inesertEmployeeTest() {
        Emploee emploee = new Emploee(999, "AAA", "BBB", 1);
        EmployeeDAO dao = new EmployeeDAO();
        List<Emploee> emploees = dao.select();
        for (Emploee e : emploees) {
            if (e.getId() == emploee.getId()) {
                try {
                    throw new Exception("Jest źle");
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        }

        List<Emploee> emploeesPoInsercie = dao.select();
        boolean isOk = false;
        for (Emploee e : emploees) {
            if (e.getId() == emploee.getId()) {
                isOk = true;
            }
        }
        Assert.assertTrue(isOk);
    }

    @Test
    public void updateEmployeeTest() {
        Emploee emploee = new Emploee(1, "AAA", "BBB", 1);
        EmployeeDAO dao = new EmployeeDAO();
        List<Emploee> emploees = dao.select();
        for (Emploee e : emploees) {
            if (e.getId() == emploee.getId() && e.getName().equals(emploee.getName()) && e.getSurname().equals(emploee.getSurname()) && e.getAge() == emploee.getAge()) {
                try {
                    throw new Exception("Jest źle");
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        }

        dao.update(emploee);

        List<Emploee> emploeesAfterUpdate = dao.select();
        boolean isOk = false;
        for (Emploee e : emploeesAfterUpdate) {
            if (e.getId() == emploee.getId() && e.getName().equals(emploee.getName()) && e.getSurname().equals(emploee.getSurname()) && e.getAge() == emploee.getAge()) {
                isOk = true;
            }
        }
        Assert.assertTrue(isOk);
    }

    @Test
    public void deleteEmployeeTest() {
        Emploee emploee = new Emploee(1, "AAA", "BBB", 1);
        EmployeeDAO dao = new EmployeeDAO();
        List<Emploee> emploees = dao.select();
        for (Emploee e : emploees) {
            if (e.getId() == emploee.getId() && e.getName().equals(emploee.getName()) && e.getSurname().equals(emploee.getSurname()) && e.getAge() == emploee.getAge()) {
                dao.delete(emploee);
            } else {
                try {
                    throw new Exception("Jest źle");
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        }
        List<Emploee> emploeesAfterDelete = dao.select();
        boolean isOk = true;
        for (Emploee e : emploeesAfterDelete) {
            if (e.getId() == emploee.getId() && e.getName().equals(emploee.getName()) && e.getSurname().equals(emploee.getSurname()) && e.getAge() == emploee.getAge()) {
                isOk = false;
            }
        }
        Assert.assertTrue(isOk);
    }
}

