package com.java.sesion02.datos.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {

	public Connection getConnection(){
		String url="";
		String usuario = "";
		String password = "";
		Connection conn = DriverManager.getConnection(url, usuario, password);
		
	}
}
