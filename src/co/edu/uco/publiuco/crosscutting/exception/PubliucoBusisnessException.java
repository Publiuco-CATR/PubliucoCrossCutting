package co.edu.uco.publiuco.crosscutting.exception;

public class PubliucoBusisnessException extends PubliucoException{

	private static final long serialVersionUID = -4636066115510646740L;

	protected PubliucoBusisnessException(String technicalMessage, String userMessage, Throwable rootCause) {
		super(technicalMessage, userMessage, rootCause, ExceptionType.BUSISNESS);
		// TODO Auto-generated constructor stub
	}
	
	public static PubliucoBusisnessException create(final String technicalMessage, final String userMessage, final Throwable rootCause) {
		return new PubliucoBusisnessException(technicalMessage, userMessage, rootCause);
	}
	
	public static PubliucoBusisnessException create(final String userMessage) {
		return new PubliucoBusisnessException(userMessage, userMessage, new Exception());
	}
	
	public static PubliucoBusisnessException create(final String technicalMessage, final String userMessage) {
		return new PubliucoBusisnessException(technicalMessage, userMessage, new Exception());
	}
	

}
