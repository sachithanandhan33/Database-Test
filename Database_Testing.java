package databaseTest;

import org.testng.annotations.Test;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



import org.openqa.selenium.WebDriver;

public class Database_Testing 
{
	
	public static WebDriver driver;
	
	        
	
	
	
	
	
	public static void main(String[] args) {
		
	}

    @Test
	public void database_test() throws SQLException, ClassNotFoundException
	{

		Class.forName("com.mysql.jdbc.Driver");
		String Dburl="jdbc:mysql://localhost:3306/DatabaseName"; ;
		String user="Db user name";
		String pwd="Db password";
		
		Connection connection = DriverManager.getConnection(Dburl,user,pwd);
		Statement statement = connection.createStatement();
		ResultSet rs = statement.executeQuery("SELECT * FROM users");

		while(rs.next())
		{
			System.out.println(rs.getInt("id"));
		}

		//connection.close();

	}
}
