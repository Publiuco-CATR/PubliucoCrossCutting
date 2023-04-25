package co.edu.uco.publiuco.utils;

public interface UtilObject {
	
	static <O> boolean isNull(final O object) {
		return object == null;
	}
	
}