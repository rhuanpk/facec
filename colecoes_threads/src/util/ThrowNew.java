package util;

public class ThrowNew {

	public static void ifBlankString(String string, String property) throws IllegalArgumentException {

		if (string.isBlank())
			throw new IllegalArgumentException(String.format("'%s' can't be blank", property));

	}

	public static void ifLessThanZero(int integer, String property) throws IllegalArgumentException {

		if (integer < 0)
			throw new IllegalArgumentException(String.format("'%s' can't be less than zero", property));

	}

	public static void ifTrueBoolean(boolean bool, String property) throws IllegalStateException {

		if (bool)
			throw new IllegalStateException(String.format("'%s' is true", property));

	}

}
