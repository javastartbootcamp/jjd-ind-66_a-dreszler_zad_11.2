package pl.javastart.task;

class IncorrectAgeException extends RuntimeException{
    public IncorrectAgeException(String message) {
        super(message);
    }
}
