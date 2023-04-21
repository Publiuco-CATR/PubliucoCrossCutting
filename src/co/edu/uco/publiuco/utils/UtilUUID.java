package co.edu.uco.publiuco.utils;

import java.util.UUID;

public final class UtilUUID {
	
	public static final String DEFAULT_UUID_AS_STRING = "00000000-0000-0000-0000-000000000000";
	public static final UUID DEFAULT_UUID = generateUUIDFromString(DEFAULT_UUID_AS_STRING);
	private static final String UUID_RE = "[a-fA-F0-9]{8}(-[a-fA-F0-9]{4}){3}-[a-fA-F0-9]{12}"; //Regular Expression
	
	private UtilUUID() {
		super();
	}
	
	public static final UUID generateNewUUID() {
		return UUID.randomUUID();
	}
	
	public static final boolean uuidStringIsValid(final String uuidValue) {
		return (UtilText.getUtilText().matchPattern(uuidValue, UUID_RE));
	}
	
	public static final UUID generateUUIDFromString(final String uuidValue) {
		UUID result = DEFAULT_UUID;
		
		if (uuidStringIsValid(uuidValue)) {
			result = UUID.fromString(uuidValue);
		}
		return result;
	}
	
	
	public static final UUID getDefault(final UUID uuidValue) {
		return UtilObject.isNull(uuidValue)? DEFAULT_UUID: uuidValue;
	}

}
