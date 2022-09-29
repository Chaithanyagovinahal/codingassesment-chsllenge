import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ipl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// TODO Auto-generated method stub
			String host="localhost";
			String port="3306";
	Connection con=DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/database", "Username", "Password");
	Statement s=con.createStatement();

	String query="SELECT Team,Consecutiveloss,avg(Pts) from data where Consecutiveloss BETWEEN 1 AND 2";
	ResultSet rs;

		rs = s.executeQuery(query);
		while(rs.next()) {
			System.out.println(rs.getString(3));
		
	} 
	con.close();
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}


















