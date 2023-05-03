package co.edu.uco.publiuco.utils;

import java.sql.Connection;
import java.sql.SQLException;

import co.edu.uco.publiuco.crosscutting.exception.PubliucoCrossCuttingException;
import co.edu.uco.publiuco.utils.Messages.UtilSqlMessages;

public class UtilSql {
	
	private 

	private UtilSql() {
		super();
	}
	
	public static void closeConnection(final Connection connection) {
		if (!connectionIsOpen(connection)) {
			try {
				connection.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
	}
	
	public static boolean connectionIsOpen(Connection connection) {
		if (UtilObject.isNull(connection)) {
			var userMessage = UtilSqlMessages.CONNECTION_IS_OPEN_USER_MESSAGE;
			var technicalMessage = UtilSqlMessages.CONNECTION_IS_OPEN_TECHNICAL_MESSAGE;
			throw PubliucoCrossCuttingException.create(userMessage, technicalMessage);
		}
		
		try {
			return !connection.isClosed();
		} catch (final Exception exeption) {
			var userMessage = UtilSqlMessages.CONNECTION_IS_OPEN_USER_MESSAGE;
			var technicalMessage = UtilSqlMessages.CONNECTION_IS_OPEN_TECHNICAL_MESSAGE;
			throw PubliucoCrossCuttingException.create(technicalMessage, userMessage, exeption);
		}
	}
}
