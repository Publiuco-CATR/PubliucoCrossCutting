package co.edu.uco.publiuco.crosscutting.exception;

public class PubliucoCrossCuttingException extends PubliucoException{

	private static final long serialVersionUID = -4636066115510646740L;

	protected PubliucoCrossCuttingException(String technicalMessage, String userMessage, Throwable rootCause) {
		super(technicalMessage, userMessage, rootCause, ExceptionType.CROSSCUTTING);
		// TODO Auto-generated constructor stub
	}
	
	public static PubliucoCrossCuttingException create(final String technicalMessage, final String userMessage, final Throwable rootCause) {
		return new PubliucoCrossCuttingException(technicalMessage, userMessage, rootCause);
	}
	
	public static PubliucoCrossCuttingException create(final String userMessage) {
		return new PubliucoCrossCuttingException(userMessage, userMessage, new Exception());
	}
	
	public static PubliucoCrossCuttingException create(final String technicalMessage, final String userMessage) {
		return new PubliucoCrossCuttingException(technicalMessage, userMessage, new Exception());
	}
	

}
