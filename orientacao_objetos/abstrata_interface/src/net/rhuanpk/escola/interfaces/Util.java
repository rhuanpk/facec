package net.rhuanpk.escola.interfaces;

public interface Util {
    static Boolean stringEmpty(String string, String message) {
        if (string.isBlank()) {
            System.out.println(message);
            return false;
        }
        return true;
    }
}
