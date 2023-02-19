/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appconnexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author M.COULIBALY
 */
public class AppConnexion {
    
    
    private final String url = "jdbc:postgresql://localhost:5432/test_all_connexion";

	private final String user = "postgres";

	private final String password = "mouhamed";

	/**
	 * Connect to the PostgreSQL database
	 *
	 * @return a Connection object
	 */
	public Connection connect() {

		Connection conn = null;

		try {

			conn = DriverManager.getConnection(url, user, password);

			System.out.println("Connected to the PostgreSQL server successfully.");

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		}

		return conn;
	}

   
    
}
