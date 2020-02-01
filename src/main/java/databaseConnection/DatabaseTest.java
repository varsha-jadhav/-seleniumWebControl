package databaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatabaseTest {

	public Connection getConnection() throws SQLException {
		String host = "localhost";
		String port = "3306";

		return DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/mydb", "root", "root");
	}

	public void insertData() throws SQLException {

		Connection con = getConnection();

	}

	public void updateData() throws SQLException {

		Connection con = getConnection();

	}

	public void fetchData() throws SQLException {

		Connection con = getConnection();
		Statement s = con.createStatement();
		ResultSet r = s.executeQuery("select * from employeeinfo where name='siya'");

		while (r.next()) {

			WebDriver driver = new ChromeDriver();
			driver.get("http://www.qaclickacademy.com/");
			driver.findElement(By.linkText("Login")).click();
			driver.findElement(By.id("user_email")).sendKeys(r.getString("name"));
			driver.findElement(By.id("user_password")).sendKeys(r.getString("name"));

		}

	}

	public static void main(String[] args) throws SQLException {

		DatabaseTest databaseTest = new DatabaseTest();

		databaseTest.fetchData();

		databaseTest.updateData();

		databaseTest.insertData();

	}

}
