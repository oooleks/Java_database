import java.sql.SQLException;
import java.util.List;

public class my_query1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		DbManager.setMysqlDbConnection();

		List<String> query = DbManager.getMysqlQuery("select LastName from students where P_Id > 100");
		
		for(int i=0; i<query.size(); i++){
			
			System.out.println(query.get(i));
		}
	}
}
