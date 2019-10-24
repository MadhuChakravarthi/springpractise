package com.nic.usermanagement.utils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DBUtils 
{
	public static ArrayList<HashMap<String,Object>> getListMap(String sql,Connection con,Object[] columnvalues) throws SQLException
	{       
		ArrayList<HashMap<String,Object>> records=new ArrayList<HashMap<String,Object>>();
		PreparedStatement ps = con.prepareStatement(sql);
		if(columnvalues!=null)
		{
			for(int ci=0;ci<columnvalues.length;ci++)
			{
				ps.setObject(ci+1, columnvalues[ci]);
			}
		}
		ResultSet rs=ps.executeQuery();
		ResultSetMetaData rm = rs.getMetaData();
		int cols = rm.getColumnCount();
		if (rs.next()) 
		{
			 do {
				 HashMap<String, Object> row = new java.util.HashMap<String, Object>(cols);
				 for (int i=1; i<=cols; i++) {
					 String columnName = rm.getColumnName(i);
					 Object columnValue = rs.getObject(i);
					 row.put(columnName.trim(), columnValue);
				 } 
				 records.add(row);
				 row = null;
			 } 
			 while (rs.next());
		 }
		//DBPlugin.closeResultSet(rs);
		//DBPlugin.closePreparedStatement(ps);
		return records;
	}
	
	
	public static Map<String,Object> getMap(String sql,Connection con,Object[] columnvalues) throws SQLException
	{
		Map<String,Object> records=new HashMap<String,Object>();
		PreparedStatement ps = con.prepareStatement(sql);
                System.out.println("PS"+ps);
		if(columnvalues!=null)
		{
			for(int ci=0;ci<columnvalues.length;ci++)
			{
				ps.setObject(ci+1, columnvalues[ci]);
			}
		}
		ResultSet rs=ps.executeQuery();
		ResultSetMetaData rm = rs.getMetaData();
		int cols = rm.getColumnCount();
		if (rs.next()) 
		{
			records = new HashMap<String, Object>(cols);
				 for (int i=1; i<=cols; i++) {
					 String columnName = rm.getColumnName(i).toUpperCase();
					 Object columnValue = rs.getObject(i);
					 records.put(columnName.trim(), columnValue);
                                         
				 } 
		 }
		//DBPlugin.closeResultSet(rs);
		//DBPlugin.closePreparedStatement(ps);
		return records;
	}
        
        
        
        
        
        public static Map<String,Object> getMapL(String sql,Connection con,Object[] columnvalues) throws SQLException
	{
		Map<String,Object> records=new HashMap<String,Object>();
		PreparedStatement ps = con.prepareStatement(sql);
                System.out.println("PS"+ps);
		if(columnvalues!=null)
		{
			for(int ci=0;ci<columnvalues.length;ci++)
			{
				ps.setObject(ci+1, columnvalues[ci]);
			}
		}
		ResultSet rs=ps.executeQuery();
		ResultSetMetaData rm = rs.getMetaData();
		int cols = rm.getColumnCount();
		if (rs.next()) 
		{
			records = new HashMap<String, Object>(cols);
				 for (int i=1; i<=cols; i++) {
					 String columnName = rm.getColumnName(i).toUpperCase();
					 Object columnValue = rs.getObject(i);
					 records.put(columnName.trim(), columnValue);
				 } 
		 }
		//DBPlugin.closeResultSet(rs);
		//DBPlugin.closePreparedStatement(ps);
		return records;
	}
	public static List<List<Object>> get2DList(String sql,Connection con,Object[] columnvalues) throws SQLException
	{
		List<List<Object>> records=new ArrayList<List<Object>>();
		PreparedStatement ps = con.prepareStatement(sql);
		if(columnvalues!=null)
		{
			for(int ci=0;ci<columnvalues.length;ci++)
			{
				ps.setObject(ci+1, columnvalues[ci]);
			}
		}
		ResultSet rs=ps.executeQuery();
		ResultSetMetaData rm = rs.getMetaData();
		int cols = rm.getColumnCount();
		if (rs.next()) 
		{
			 do {
				 ArrayList<Object> row = new ArrayList<Object>(cols);
				 for (int i=1; i<=cols; i++) {
					 row.add(rs.getObject(i));
				 } 
				 records.add(row);
				 row = null;
			 } 
			 while (rs.next());
		 }
		//DBPlugin.closeResultSet(rs);
		//DBPlugin.closePreparedStatement(ps);
		return records;
	}
	public static List<Object> getList(String sql,Connection con,Object[] columnvalues) throws SQLException
	{
		List<Object> records=new ArrayList<Object>();
		PreparedStatement ps = con.prepareStatement(sql);
		if(columnvalues!=null)
		{
			for(int ci=0;ci<columnvalues.length;ci++)
			{
				ps.setObject(ci+1, columnvalues[ci]);
			}
		}
               // System.out.println("PS"+sql);
		ResultSet rs=ps.executeQuery();
		ResultSetMetaData rm = rs.getMetaData();
               
		int cols = rm.getColumnCount();
		if(rs.next()) 
		{
			        records = new ArrayList<Object>();
				 for (int i=1; i<=cols; i++) {
                                         // System.out.println("RMCOLS"+rs.getObject(i));
					  records.add(rs.getObject(i));
                                          //System.out.println("RESULT"+i);
				 } 
		 }
                //System.out.println("LENGTH"+records.size());
		//DBPlugin.closeResultSet(rs);
		//DBPlugin.closePreparedStatement(ps);
		return records;
	}
        public static Long getDBValue(String sql,Connection con,Object[] columnvalues) throws Exception
        {
            Long val=0L;
            
                PreparedStatement ps = con.prepareStatement(sql);
		if(columnvalues!=null)
		{
			for(int ci=0;ci<columnvalues.length;ci++)
			{
				ps.setObject(ci+1, columnvalues[ci]);
			}
		}
		ResultSet rs=ps.executeQuery();
                if (rs.next()) 
		{
			val=rs.getLong(1);
		 }
		//DBPlugin.closeResultSet(rs);
		//DBPlugin.closePreparedStatement(ps);
            return val;
        }
        
        public static int getDBValueInt(String sql,Connection con,Object[] columnvalues) throws Exception
        {
            int val=0;
            
                PreparedStatement ps = con.prepareStatement(sql);
		if(columnvalues!=null)
		{
			for(int ci=0;ci<columnvalues.length;ci++)
			{
				ps.setObject(ci+1, columnvalues[ci]);
			}
		}
		ResultSet rs=ps.executeQuery();
                if (rs.next()) 
		{
			val=rs.getInt(1);
		 }
		//DBPlugin.closeResultSet(rs);
		//DBPlugin.closePreparedStatement(ps);
            return val;
        }
        
        public static ArrayList<HashMap<String,Object>> getListMapWithString(String sql,Connection con,Object[] columnvalues) throws SQLException
	{       
		ArrayList<HashMap<String,Object>> records=new ArrayList<HashMap<String,Object>>();
		PreparedStatement ps = con.prepareStatement(sql);
		if(columnvalues!=null)
		{
			for(int ci=0;ci<columnvalues.length;ci++)
			{
				ps.setObject(ci+1, columnvalues[ci]);
			}
		}
		ResultSet rs=ps.executeQuery();
		ResultSetMetaData rm = rs.getMetaData();
		int cols = rm.getColumnCount();
		if (rs.next()) 
		{
			 do {
				 HashMap<String, Object> row = new java.util.HashMap<String, Object>(cols);
				 for (int i=1; i<=cols; i++) {
					 String columnName = rm.getColumnName(i);
					 String columnValue = rs.getString(i);
					 row.put(columnName.trim(), columnValue);
				 } 
				 records.add(row);
				 row = null;
			 } 
			 while (rs.next());
		 }
		//DBPlugin.closeResultSet(rs);
		//DBPlugin.closePreparedStatement(ps);
		return records;
	}
}
