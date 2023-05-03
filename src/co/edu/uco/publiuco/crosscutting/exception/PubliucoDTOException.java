package co.edu.uco.publiuco.crosscutting.exception;

public class PubliucoDTOException extends PubliucoException{

	private static final long serialVersionUID = -4636066115510646740L;

	protected PubliucoDTOException(String technicalMessage, String userMessage, Throwable rootCause) {
		super(technicalMessage, userMessage, rootCause, ExceptionType.DTO);
		// TODO Auto-generated constructor stub
	}
	
	public static PubliucoDTOException create(final String technicalMessage, final String userMessage, final Throwable rootCause) {
		return new PubliucoDTOException(technicalMessage, userMessage, rootCause);
	}
	
	public static PubliucoDTOException create(final String userMessage) {
		return new PubliucoDTOException(userMessage, userMessage, new Exception());
	}
	
	public static PubliucoDTOException create(final String technicalMessage, final String userMessage) {
		return new PubliucoDTOException(technicalMessage, userMessage, new Exception());
	}
	

}
