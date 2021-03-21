import javax.sql.RowSetEvent;
import javax.sql.RowSetListener;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class RowSetExample2 {

	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver");
		
		JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();
		rowSet.setUrl("jdbc:mysql://localhost:3306/jdbcconnection");
		rowSet.setUsername("root");
		rowSet.setPassword("");
		
		rowSet.setCommand("select * from emp2");
		rowSet.execute();
		
		rowSet.addRowSetListener(new MyListener());
		
		while(rowSet.next()) {
			System.out.println("Id: " + rowSet.getInt(1));
			System.out.println("Name: " + rowSet.getString(2));
			System.out.println("Salary: " + rowSet.getInt(3));

		}
		
	}

}

class MyListener implements RowSetListener {

	@Override
	public void rowSetChanged(RowSetEvent event) {
		System.out.println("RowSet Changed...");
		
	}

	@Override
	public void rowChanged(RowSetEvent event) {
		System.out.println("Row Changed...");
		
	}

	@Override
	public void cursorMoved(RowSetEvent event) {
		System.out.println("Cursor Moved...");
		
	}
}
