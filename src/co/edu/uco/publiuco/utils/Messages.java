package co.edu.uco.publiuco.utils;

public class Messages {
	
	public static final class UtilSqlMessages{
		public static final String CONNECTION_IS_OPEN_USER_MESSAGE = "Se ha presentado un problema tratando de validar si una conexion con la fuente de informacion estaba o no activa";
		public static final String CONNECTION_IS_OPEN_TECHNICAL_MESSAGE = "Se ha presentado un problema tratando de validar si una conexion con la fuente de informacion estaba o no activa";
		public static final String CONNECTION_IS_OPEN_TECHNICAL_NULL_CONNECTION = "No es posible validar si una conexion esta abierta cuando se encuentra nula";
		public static final String CONNECTION_IS_OPEN_TECHNICAL_SQL_EXCEPTION = "Se ha presentado un excepcion de tipo SQLException tratando de validar si la conexion estaba o no abierta. Por favor valida la traza de errores completa de la excepcion presentada...";
		public static final String CONNECTION_IS_OPEN_TECHNICAL_EXCEPTION = "Se ha presentado un excepcion de tipo SQLException tratando de validar si la conexion estaba o no abierta. Por favor valida la traza de errores completa de la excepcion presentada...";
		public static final String OPEN_CONNECTION_USER_MESSAGE = "Se ha presentado un problema al tratar de abrir la conexión a la base de datos";
		public static final String OPEN_CONNECTION_TECHNICAL_MESSAGE = "Se ha presentado un problema al tratar de abrir la conexión a la base de datos";
		public static final String UPDATE_TRANSACTION_USER_MESSAGE = "Se ha presentado un error a la hora de ejectutar";
		public static final String UPDATE_TRANSACTION_TECHNICAL_MESSAGE = "Se ha presentado un error a la hora de ejectutar";
		public static final String BEGIN_TRANSACTION_USER_MESSAGE = "Se ha presentado un error a la hora de ejectutar";
		public static final String BEGIN_TRANSACTION_TECHNICAL_MESSAGE = "Se ha presentado un error a la hora de ejectutar";
		public static final String CONFIRM_TRANSACTION_USER_MESSAGE = "Se ha presentado un error a la hora de ejectutar";
		public static final String CONFIRM_TRANSACTION_TECHNICAL_MESSAGE = "Se ha presentado un error a la hora de ejectutar";
		public static final String CANCEL_TRANSACTION_USER_MESSAGE = "Se ha presentado un error a la hora de ejectutar";
		public static final String CANCEL_TRANSACTION_TECHNICAL_MESSAGE = "Se ha presentado un error a la hora de ejectutar";
	}
}