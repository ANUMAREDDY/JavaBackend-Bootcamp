package com.ar.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.ar.bo.StudentBO;

public final class StudentDAOImpl implements IStudentDAO {
	private DataSource ds;
	public StudentDAOImpl(DataSource ds){
		System.out.println("Student DAO 1-Param Constructor");
		this.ds=ds;
	}

	@Override
	public int insert(StudentBO bo) throws Exception {
		final String STUDENT_QUERY="INSERT INTO STUDENT_TABLE(studentName,studentClass,exam,telugu,english,mathematics,science,social,totalMarks) VALUES(?,?,?,?,?,?,?,?,?)";
		Connection con=null;
		PreparedStatement ps=null;
		int count=0;
		try {
			//Get connection object
			con=ds.getConnection();
			//create Prepared statement object having Pre-compiled SQL query
			ps=con.prepareStatement(STUDENT_QUERY);
			//set query param
			ps.setString(1,bo.getStudentName());
			ps.setFloat(2,bo.getStudentClass());
			ps.setString(3,bo.getExam());
			ps.setFloat(4,bo.getTelugu());
			ps.setFloat(5,bo.getEnglish());
			ps.setFloat(6,bo.getMathematics());
			ps.setFloat(7,bo.getScience());
			ps.setFloat(8,bo.getSocial());
			ps.setFloat(9,bo.getTotalMarks());
			//excute query
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
