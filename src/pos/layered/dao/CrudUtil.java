/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layered.dao;
import java.sql.PreparedStatement;
import java.sql.Connection;
import pos.layered.db.DBConnection;
/**
 *
 * @author sujah
 */
public class CrudUtil {
    private static PreparedStatement getPreparedStatement(String sql, Object[]...args){
        Connection connection = DBConnection.getInstance().getConnection();
    }
}
