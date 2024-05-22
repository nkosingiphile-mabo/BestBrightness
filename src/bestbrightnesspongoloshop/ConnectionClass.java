/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bestbrightnesspongoloshop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author user pc
 */
public class ConnectionClass {
    Connection connection;
    ResultSet resultSet;
    Statement statement;
    
    public void connection()
    {
        try
        {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            connection = DriverManager.getConnection("jdbc:ucanaccess://myDatabase.accdb");
            //Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            //connection = DriverManager.getConnection("jdbc:derby://localhost:1527/myDatabase");
            statement = connection.createStatement();
        }
        catch(Exception ex)
        {
           JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    public void  insert(String sql)
    {
            try{
                connection();
                statement.executeUpdate(sql);
            }
            catch(SQLException ex)
            {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
    }
    public void update(String sql)
    {
            try{
                connection();
                statement.executeUpdate(sql);
                
            }
            catch(Exception ex)
            {
                JOptionPane.showMessageDialog(null, "Something went wrong when trying to update the database!");
            }  
    }
    public void delete(String sql)
    {
        try
        {
                connection();
                statement.executeUpdate(sql);
                
                JOptionPane.showMessageDialog(null, "deleted Successful");
        }
        catch(Exception ex)
        {
                JOptionPane.showMessageDialog(null, "Something went wrong when trying to delete from the database!");
        }  
    }
    
    public void display(String sql, JTable javaTable)
    {
        try{
            connection();
            resultSet = statement.executeQuery(sql);
            javaTable.setModel(DbUtils.resultSetToTableModel(resultSet));
        }
        catch(Exception ex)
        {
                JOptionPane.showMessageDialog(null, "Something went wrong when trying to retrieve from the database!\n\n"+ex.getMessage());
        }  
    }
    
    public ResultSet getData(String sql)
    {
        try
        {
            connection();
            resultSet = statement.executeQuery(sql);
        }
        catch(Exception ex)
        {
             JOptionPane.showMessageDialog(null, "Something went wrong when trying to retrive from the database!\n"+ex.getMessage());
        }
        return resultSet;
    }
    
    public int getCount(String sql)
    {
        int count = 0;
        try {
            connection();
            resultSet = statement.executeQuery(sql);
            if (resultSet.next()) {
                count = resultSet.getInt(1);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Something went wrong when trying to retrieve from the database!\n" + ex.getMessage());
        }
        return count;
    }
}
