package lesson16.P3;

public enum Operations {

    UNDO,REDO,DELETE,HOME,END,ENTER;

    public static Operations generateRandom() {
        int random = (int) (Math.random() * (Operations.values().length));
        return Operations.values()[random];
    }

}
