package com.ar.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;
import com.ar.bo.CustomerBO;

public class CustomerDAOImpl implements ICustomerDAO {
	private DataSource ds;

	public CustomerDAOImpl(DataSource ds) {
		super();
		this.ds = ds;
	}

	@Override
	public int insert(CustomerBO bo) throws Exception {
		final String REALTIMEDI_CUSTOMER_INSERT_QUERY="INSERT INTO CUSTOMER_TABLE (customerName,customerAddress,principleAmount,Rate,time,intrest,intrestAmount) VALUES (?,?,?,?,?,?,?)";
		Connection con=null;
		PreparedStatement ps=null;
		int count=0;
		
		try {
			//get pooled jdbc con obj
			con=ds.getConnection();
			//create  PreparedStatement object having pre-compiled SQL query;
			ps=con.prepareStatement(REALTIMEDI_CUSTOMER_INSERT_QUERY);
			//set query param values
			ps.setString(1,bo.getCustomerName());
			ps.setString(2,bo.getCustomerAddress());
			ps.setFloat(3,bo.getPrincipleAmount());
			ps.setFloat(4,bo.getRate());
			ps.setFloat(5,bo.getTime());
			ps.setFloat(6,bo.getIntrest());
			ps.setFloat(7,bo.getIntrestAmount());
			//excute the Query
			count=ps.executeUpdate();
		}
		catch(SQLException se) {
			se.printStackTrace();
			throw se;
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
		finally {
			//Close JDBC obj
			try {
				if(ps!=null)
					ps.close();
			}
			catch(SQLException se) {
				se.printStackTrace();
				throw se;
			}
			try {
				if(con!=null)
					ps.close();
			}
			catch(SQLException se) {
				se.printStackTrace();
				throw se;
			}
		}
		
		
		return count;
	}

}
