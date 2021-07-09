package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import bean.Reservation;

public class ReservationDao extends Dao {

	public int insert(Reservation reservation) throws Exception {
		Connection con = getConnection();

		PreparedStatement st = con.prepareStatement(
				"insert into reserve values(null,?,?,?)");
		st.setString(1, reservation.getName());
		st.setString(2, reservation.getDate());
		st.setString(3, reservation.getTime());
		int line = st.executeUpdate();

		st.close();
		con.close();
		return line;
	}
}
