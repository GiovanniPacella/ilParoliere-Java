package Controller;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {

    private static final String DB_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_CONNECTION ="jdbc:mariadb://172.22.201.51:3306/Pacella_DB";
    private static final String DB_USER = "utentedb";
    private static final String DB_PASSWORD = "Cobi_2022_$";
    private Connection connessione;
    //PASSWORD DB : P4ch1s3c4b4c4

    //costruttore
    public DBConnection() {
        System.out.println("Inizio Connessione...");
        try {
            System.out.println("Cerco i driver...");
            Class.forName("org.mariadb.jdbc.Driver");
            System.out.println("Driver trovati");
        } catch (Exception ex) {
            // handle the error
            System.out.println("errore JDBC");
        }
        try{
            Connection dbConnection = null;
            System.out.println("Provo a connettermi al Database...");
            dbConnection = DriverManager.getConnection(DB_CONNECTION, DB_USER,
                    DB_PASSWORD);

            System.out.println("SQL Connection to DB eseguita correttamente!");
            this.connessione = dbConnection;
        } catch (SQLException e) {
            System.out.println("Connection to dbmio database failed");
            System.out.println(e.getErrorCode() + ":" + e.getMessage());
            // throw new SQLException(e.getErrorCode() + ":" + e.getMessage());
        }

    }

    public Connection getConnessione() {
        return connessione;
    }

    public static ResultSet QuerySelect(Connection conn, String query) {
        Statement stmt = null;
        try {
            stmt = conn.createStatement();
            ResultSet list = stmt.executeQuery(query);
            return list;
        }
        catch (SQLException sqle) {
            System.out.println("SELECT ERROR");
            return null;
        } catch (Exception err) {
            System.out.println("GENERIC ERROR");
            return null;
        }
    }

    public boolean QueryGenerica(Connection conn, String query) {
        Statement stmt = null;
        boolean trovato = false;
        try
        {
            stmt = conn.createStatement();
            stmt.executeQuery(query);
            trovato = true;
            return trovato;
        }
        catch (SQLException sqle) {
            System.out.println("QUERY ERROR");
            return false;
        } catch (Exception err) {
            System.out.println("GENERIC ERROR");
            return false;
        }
    }
}