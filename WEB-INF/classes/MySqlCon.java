import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class MySqlCon {
    public static Connection connection;
    public static Statement stmt;

    public MySqlCon() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ajp", "root", "root");
            stmt = connection.createStatement();
        } catch (SQLException | ClassNotFoundException exception) {
            exception.printStackTrace();
        }
    }

    public static void setData(){

    }
    public Boolean postApplication(Application application){
		try{
			System.out.println(application);
			// String query = String.format("insert into applications (userid, jobid, name, email, age, mobile, qualification, specification, skills, gender, address) values ( '%d','%d', '%s', '%s', %d, '%s', '%s', '%s', '%s', '%s', '%s')", application.user.id, application.job.id, application.name, application.email, application.age, application.mobile, application.qualification, application.specification, application.skills, application.gender, application.address);
            String query = String.format("INSERT INTO application (firstName, lastName, email, alternateEmail, phone, dob, age, gender, address, profile, sslc, hsc, qualification, specification, cgpa, resume) VALUES ('%s', '%s', '%s', '%s', '%s', '%s', '%d', '%s', '%s', '%s', '%f', '%f', '%s', '%s', '%f', '%s');", application.firstName, application.lastName, application.email, application.alternateEmail, application.phone, application.dob, application.age, application.gender, application.address, application.profile, application.sslc, application.hsc, application.qualification, application.specification, application.cgpa, application.resume);
			stmt.executeUpdate(query);
            return true;
		}catch (SQLException exception){
			exception.printStackTrace();
            return false;
		}
	}

    public List<Application> getApplications() throws SQLException{
        List<Application> applications = new ArrayList<>();
        PreparedStatement st;
        try {
            st = connection
            			.prepareStatement("Select * from application");
                        ResultSet rs = st.executeQuery();
			while (rs.next()) {
				applications.add(new Application(rs.getString("firstName"), rs.getString("lastName"), rs.getString("email"), rs.getString("alternateEmail"), rs.getString("phone"), rs.getString("dob"), rs.getString("age"), rs.getString("gender"), rs.getString("address"), rs.getString("profile"), rs.getString("sslc"), rs.getString("hsc"), rs.getString("qualification"), rs.getString("specification"), rs.getString("cgpa"), rs.getString("resume")));
			}
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
			
        return applications;
    }
}