/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Default;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import java.sql.*;

/**
 *
 * @author COE-14
 */
@WebService(serviceName = "DB_Connection")
public class DB_Connection {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "operation")
    public Integer operation(@WebParam(name = "x") String x, @WebParam(name = "y") String y) {
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ip_lab","root","");
            PreparedStatement ps = con.prepareStatement("Insert into thoughts values (?,?)");
            ps.setString(1,x);
            ps.setString(2,y);
            int i = ps.executeUpdate();
            
            return i;
        }
        
        catch(Exception e) {
            System.out.println(e);
        }
        
        //TODO write your implementation code here:
        return null;
    }

    /**
     * This is a sample web service operation
     */

}
