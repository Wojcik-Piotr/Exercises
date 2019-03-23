package pl.sdacademy.jdbc.src.DAOimplamentation.SQLGenerators;

import DAOimplamentation.Entities.Emploee;

public class EmployeeSQLGenerator implements SQLGenerator<Emploee> {
    @Override
    public String insert(Emploee toInsert) {
        StringBuilder sb=new StringBuilder();
        sb.append("INSERT INTO Employees (id, firstname, lastname, age) VALUES (")
                .append(toInsert.getId())
                .append(", '").append(toInsert.getName()).append("', '")
                .append(toInsert.getSurname()).append("', ")
                .append(toInsert.getAge()).append(");");
        return sb.toString();
    }

    @Override
    public String selectALL() {
        return "SELECT * FROM Employees";
    }

    @Override
    public String update(Emploee toUpdate) {
        StringBuilder sb= new StringBuilder();
        sb.append("UPDATE Employees SET firstname= '").append(toUpdate.getName())
                .append("', lastname= '").append(toUpdate.getSurname())
                .append("', age= ").append(toUpdate.getAge())
                .append(" WHERE (id=").append(toUpdate.getId()).append(");");
        return sb.toString();
    }

    @Override
    public String delete(Emploee toDelete) {
        return "DELETE FROM Employees WHERE id="+ toDelete.getId()+";";
    }
}
