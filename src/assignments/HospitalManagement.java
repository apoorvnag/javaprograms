package assignments;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class HospitalManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String speciality = args[0];
		
		Connection conn;
		try {
			conn = DriverManager.getConnection( "jdbc:mysql://localhost:3306/apn", "tripoto_admin", "tripoto123");
			Statement stmt = conn.createStatement();
			String strSelect = "SELECT * \n" + 
					"FROM hospitals h, `hospital_clinical_specialities` hcs, `clinical_specialities` cs\n" + 
					"WHERE h.id=hcs.`hospital_id` AND hcs.`speaciality_id`=cs.`id`\n" + 
					"AND cs.name='"+speciality+"'";
			ResultSet rs = stmt.executeQuery(strSelect);
			
			System.out.println("\n\nList of Hospitals offering " + speciality);
			
			while(rs.next()) {
				System.out.println(rs.getString("name"));
			}
		} catch (SQLException e) {
			System.out.println("Exception Occured " + e.getMessage());
		} // MySQL
		
		
		
		
		
	}

}
