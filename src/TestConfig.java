
public class TestConfig {

	public static String server = "smtp.gmail.com";
	public static String from = "oooleks@gmail.com";
	public static String password = "203717";
	public static String[] to = {"ooleks@yahho.com"};
	public static String subject = "Test Report";
	
	public static String messageBody = "TestMessage";
	public static String attachmentPath = "C:/screenshot/selenium_error.jpg";
	public static String attachmentName = "Error.jpeg";
	
	//SQL SERVER DATABASE DETAILS
	public static String driver = "net.sourceforge.jtds.jdbc.Driver";
	public static String dbConnectionUrl = "jdbc:jtds:sqlserver://192.101.44.22;DatabaseName=monitor_eval";
	public static String dbUserName = "sa";
	public static String dbPassword = "123456";
	
	//MYSQL DATABASE DETAILS
	public static String mysqldriver = "com.mysql.jdbc.Driver";
	public static String mysqluserName = "oleks";
	public static String mysqlpassword = "203717ool";
	public static String mysqlurl = "jdbc:mysql://localhost:3306/studentsdb";	
}
