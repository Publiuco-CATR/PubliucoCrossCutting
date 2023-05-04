package co.edu.uco.publiuco.crosscutting.exception;

public class PubliucoDataException extends PubliucoException{

	private static final long serialVersionUID = -4636066115510646740L;

	protected PubliucoDataException(String technicalMessage, String userMessage, Throwable rootCause) {
		super(technicalMessage, userMessage, rootCause, ExceptionType.DATA);
		// TODO Auto-generated constructor stub
	}
	
	public static PubliucoDataException create(final String technicalMessage, final String userMessage, final Throwable rootCause) {
		return new PubliucoDataException(technicalMessage, userMessage, rootCause);
	}
	
	public static PubliucoDataException create(final String userMessage) {
		return new PubliucoDataException(userMessage, userMessage, new Exception());
	}
	
	public static PubliucoDataException create(final String technicalMessage, final String userMessage) {
		return new PubliucoDataException(technicalMessage, userMessage, new Exception());
	}
	

}
