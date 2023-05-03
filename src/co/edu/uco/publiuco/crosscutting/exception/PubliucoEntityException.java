package co.edu.uco.publiuco.crosscutting.exception;

public class PubliucoEntityException extends PubliucoException{

	private static final long serialVersionUID = -4636066115510646740L;

	protected PubliucoEntityException(String technicalMessage, String userMessage, Throwable rootCause) {
		super(technicalMessage, userMessage, rootCause, ExceptionType.ENTITY);
		// TODO Auto-generated constructor stub
	}
	
	public static PubliucoEntityException create(final String technicalMessage, final String userMessage, final Throwable rootCause) {
		return new PubliucoEntityException(technicalMessage, userMessage, rootCause);
	}
	
	public static PubliucoEntityException create(final String userMessage) {
		return new PubliucoEntityException(userMessage, userMessage, new Exception());
	}
	
	public static PubliucoEntityException create(final String technicalMessage, final String userMessage) {
		return new PubliucoEntityException(technicalMessage, userMessage, new Exception());
	}
	

}
