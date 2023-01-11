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
	
	        //DB_CONNECTION=mysql
			//DB_HOST=localhost
			//DB_PORT=3306
			//DB_DATABASE=empowers_1clxlite
			//DB_USERNAME=empowers_1clxlite
			//DB_PASSWORD=sYPVWjlmT8]L
	
	
	
	//"jdbc:mysql://localhost:3306/sachin"; jdbc:mysql://localhost:3306/empowers_1clxlite 
	
	public static void main(String[] args) {
		
	}

    @Test
	public void database_test() throws SQLException, ClassNotFoundException
	{

		Class.forName("com.mysql.jdbc.Driver");
		String Dburl="jdbc:mysql://localhost:3306/empowers_1clxlite";
		String user="empowers_1clxlite";
		String pwd="sYPVWjlmT8]L";
		
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
