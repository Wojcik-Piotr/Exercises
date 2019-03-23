package pl.sdacademy.jdbc.src.DAOimplamentation.DAOs;

import DAOimplamentation.BaseDAO;
import DAOimplamentation.Entities.Emploee;
import DAOimplamentation.SQLGenerators.EmployeeSQLGenerator;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class EmployeeDAO extends BaseDAO<Emploee> {
    EmployeeSQLGenerator sqlGenerator = new EmployeeSQLGenerator();

    @Override
    public void insert(Emploee toInsert) {
        sql = sqlGenerator.insert(toInsert);
        execute();
    }

    @Override
    public List<Emploee> select() {
        sql = sqlGenerator.selectALL();
        return executeSelect();
    }

    @Override
    public void update(Emploee toUpdate) {
        sql = sqlGenerator.update(toUpdate);
        execute();
    }

    @Override
    public void delete(Emploee toDelete) {
        sql = sqlGenerator.delete(toDelete);
        execute();
    }

    @Override
    protected List<Emploee> parse(ResultSet rs) {
        ArrayList<Emploee> resolt = new ArrayList<>();
        try {
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("firstname");
                String lastname = rs.getString("lastname");
                int age = rs.getInt("age");

                resolt.add(new Emploee(id,name,lastname,age));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resolt;
    }
}
