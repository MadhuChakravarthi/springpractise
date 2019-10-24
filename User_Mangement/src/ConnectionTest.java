import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class ConnectionTest {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		Connection con=null;
	     Class.forName("org.postgresql.Driver");
	       
	       con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/ecabinet","postgres", "root");
		
		 System.out.println(con);

	}

}
