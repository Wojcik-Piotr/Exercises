package pl.sdacademy.jdbc.src.DAOimplamentation;

import DAOimplamentation.Entities.Entiti;

import java.sql.*;
import java.util.List;
import java.util.Properties;

public abstract class BaseDAO<T extends Entiti> {
    private final String dbms = "mysql";
    private final String userName = "thobho";
    private final String serverName = "localhost";
    private final int portNumber = 3306;
    private final String databaseName = "emp";
    private final String password = "Haslo123";
    protected String sql;
    private Connection conn;

    public abstract void insert(T toInsert);

    public abstract List<T> select();

    public abstract void update(T toUpdate);

    public abstract void delete(T toDelete);

    Connection getConnection() throws SQLException {
        Properties connectionProps = new Properties();
        connectionProps.put("User", this.userName);
        connectionProps.put("password", this.password);
        conn = DriverManager.getConnection(
                "jdbc:" + this.dbms + "://" +
                        this.serverName +
                        ":" + this.portNumber + "/" +
                        this.databaseName,
                connectionProps);
        return conn;
    }

    void testConnection(Connection con) throws SQLException {
        Statement stmt = null;
        String query = "SELECT USER();";
        try {
            stmt = con.createStatement();
            ResultSet resultSet = stmt.executeQuery(query);

            while (resultSet.next()) {
                String user = resultSet.getString(1);
                System.out.println(user);
            }
        } catch (SQLException e) {
            System.out.println(e.getErrorCode());
        } finally {
            if (stmt != null) {
                stmt.close();
            }
        }
    }

    public void execute() {
        try {
            conn = getConnection();
            Statement stet = conn.createStatement();
            stet.execute(sql);

            stet.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    protected abstract List<T> parse(ResultSet rs);

    protected List<T> executeSelect() {
        try {
            conn = getConnection();
            Statement stet = conn.createStatement();
            ResultSet rs = stet.executeQuery(sql);
            List<T> result = parse(rs);
            rs.close();
            stet.close();
            conn.close();
            return result;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}