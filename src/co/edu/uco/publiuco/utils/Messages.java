package co.edu.uco.publiuco.utils;

import java.sql.SQLException;

public class Messages {
	
	private Messages() {}
	
	public static final class UtilSqlMessages{
		
		private UtilSqlMessages() {}
		
		public static final String CONNECTION_IS_OPEN_USER_MESSAGE = "Se ha presentado un problema tratando de validar si una conexion con la fuente de informacion estaba o no activa";
		public static final String CONNECTION_IS_OPEN_TECHNICAL_MESSAGE = "Se ha presentado un problema tratando de validar si una conexion con la fuente de informacion estaba o no activa";
		public static final String CONNECTION_IS_OPEN_TECHNICAL_NULL_CONNECTION = "No es posible validar si una conexion esta abierta cuando se encuentra nula";
		public static final String CONNECTION_IS_OPEN_TECHNICAL_SQL_EXCEPTION = "Se ha presentado un excepcion de tipo SQLException tratando de validar si la conexion estaba o no abierta. Por favor valida la traza de errores completa de la excepcion presentada...";
		public static final String CONNECTION_IS_OPEN_TECHNICAL_EXCEPTION = "Se ha presentado un excepcion de tipo SQLException tratando de validar si la conexion estaba o no abierta. Por favor valida la traza de errores completa de la excepcion presentada...";
		public static final String OPEN_CONNECTION_USER_MESSAGE = "Se ha presentado un problema al tratar de abrir la conexión a la base de datos";
		public static final String OPEN_CONNECTION_TECHNICAL_MESSAGE = "Se ha presentado un problema al tratar de abrir la conexión a la base de datos";
		public static final String UPDATE_TRANSACTION_USER_MESSAGE = "Se ha presentado un error a la hora de ejectutar";
		public static final String UPDATE_TRANSACTION_TECHNICAL_MESSAGE = "Se ha presentado un error a la hora de ejectutar";
		//		COMMIT TRANSACTION EXCEPTIONS
		public static final String COMMIT_TRANSACTION_USER_MESSAGE = "Se ha presentado un error a la hora de ejectutar";
		public static final String COMMIT_TRANSACTION_TECHNICAL_MESSAGE = "Se ha presentado un error a la hora de ejectutar";
		//		ROLLBACK TRANSACTION EXCEPTIONS
		public static final String ROLLBACK_TRANSACTION_USER_MESSAGE = "Se ha presentado un error a la hora de ejectutar";
		public static final String ROLLBACK_TRANSACTION_TECHNICAL_MESSAGE = "Se ha presentado un error a la hora de ejectutar";
		//	INIT TRANSACTION EXCEPTIONS
		public static final String TRANSACTION_IS_NOT_OPEN_USER_MESSAGE = "Se ha presentado un error tratando de ejecutar la acción solicitada. Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicación"; 
		public static final String TRANSACTION_IS_NOT_OPEN_TECHNICAL_MESSAGE = "se he presentado una excepción tratando de validar si la conexión esta abierta o no al momento de ejecutar la acción solicitada. Por favor valide la traza completa de la excepción presentada";
		public static final String TRANSACTION_AUTO_COMMIT_IS_TRUE_USER_MESSAGE = "Se ha presentado un error tratando de ejecutar la acción solicitada. Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicación"; 
		public static final String TRANSACTION_AUTO_COMMIT_IS_TRUE_TECHNICAL_MESSAGE = "se he presentado una excepción tratando de validar si el auto commit esta activo o no  al momento de ejecutar la acción solicitada. Por favor valide la traza completa de la excepción presentada";
		public static final String INIT_TRANSACTION_USER_MESSAGE = "Se ha presentado un error a la hora de ejectutar";
		public static final String INIT_TRANSACTION_TECHNICAL_MESSAGE = "Se ha presentado un error a la hora de ejectutar";
		// JAVA SQLEXCEPTION
		public static final String SQL_EXCEPTION_USER_MESSAGE = "Se ha presentado una excepción desconocida a la hora de ejecutar la tarea solicitada.  Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicación";
		public static final String generateSqlExceptionTechnicalMessage(SQLException exception) {
			return "Se ha presentado una excepción desconocida de tipo \"" + exception.toString() + "\" a la hora de ejecutar la tarea solicitada. Por favor valide la traza completa de la excepción presentada"; 
		}
	}
	
	public static final class EstadoFacadeImplMessages{
		
		private EstadoFacadeImplMessages() {}
		
		public static final String REGISTRER_ESTADO_USER_MESSAGE = "Se ha presentado un problema tratando de registrar la información del nuevo Estado. Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicación";
		public static final String REGISTRER_ESTADO_TECHNICAL_MESSAGE = "Se ha presentado una excepción no conocida al momento de registrar un nuevo valor de estado. Por favor valide la traza completa de la excepción presentada";
	}
}
