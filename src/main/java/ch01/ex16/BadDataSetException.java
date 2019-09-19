package ch01.ex16;

class BadDataSetException extends Exception {
    String message;
    BadDataSetException(String message) {
        this.message = message;
    }
}
