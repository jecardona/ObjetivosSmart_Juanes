package baseDatosMySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

 
public class MySQL {
 
    public Connection conexion = null;
    public Statement comando = null;
    public ResultSet registro;
 
    public Connection MySQLConnect() throws SQLException {
 
            String servidor = "jdbc:mysql://localhost:3306/empresa?allowPublicKeyRetrieval=true&useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
            String usuario = "juanes3";
            String pass = "juanes3";
            //Se inicia la conexión
            conexion = DriverManager.getConnection(servidor, usuario, pass);
 
        return conexion;
    }
        
}