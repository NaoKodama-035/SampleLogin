package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import bean.Members;

public class MembersDao extends Dao {
	public Members search(String userid, String password)
			throws Exception {
		Members members = null;

		Connection con = getConnection();

		PreparedStatement st;
		st = con.prepareStatement(
				"select * from members where userid=? and password=?");
		st.setString(1, userid);
		st.setString(2, password);
		ResultSet rs = st.executeQuery();

		while (rs.next()) {
			members = new Members();
			members.setId(rs.getInt("id"));
			members.setUserId(rs.getString("userid"));
			members.setName(rs.getString("name"));
			members.setPassword(rs.getString("password"));
		}

		st.close();
		con.close();
		return members;

	}

}
