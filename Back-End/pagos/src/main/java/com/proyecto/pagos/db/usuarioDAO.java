package com.proyecto.pagos.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.springframework.stereotype.Service;

import com.proyecto.pagos.entities.usuario;

@Service
public class usuarioDAO {
	Connection con;
	String query;
	
	public usuarioDAO() {
		this.con = null;
		this.query = "";
	}
	
	public Connection conectar(){
		try {
		    con = DriverManager.getConnection("jdbc:mysql://localhost/pagos?user=root&password=");
		    return con;
		} catch (SQLException ex) {
		    // handle any errors
		    System.out.println("SQLException: " + ex.getMessage());
		    System.out.println("SQLState: " + ex.getSQLState());
		    System.out.println("VendorError: " + ex.getErrorCode());
		    return con;
		}
	
	}
	
	public boolean insertar(usuario usuario){
		conectar();
		Statement sentencia;
		try {
			sentencia = conectar().createStatement();
			
			query = "insert into usuario(correo,contraseña) values ('"+usuario.getCorreo()+"','"+usuario.getContraseña()+"');";
			if (sentencia.executeUpdate(query) > 0) {
	            return true;
	            
	        } else {
	            return false;
	        }
			
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean iniciar_sesion(usuario usuario){
		conectar();
		Statement sentencia;
		try {
			sentencia = conectar().createStatement();
			
			query = "select idUsuario from usuario where correo= '"+usuario.getCorreo()+"' and contraseña='"+usuario.getContraseña()+"';";
			if (sentencia.executeQuery(query).first()) {
	            return true;
	            
	        } else {
	            return false;
	        }
			
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	
}
