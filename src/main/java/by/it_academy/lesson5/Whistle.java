package by.it_academy.lesson5;

public class Whistle {

    private String sound;

    public static void sound() {
        System.out.println("sound");
    }

    Whistle(final String Sound) {
        this.sound = sound;
    }

    public static void main(String[] args) {
        Whistle whistle = new Whistle("do");
        Whistle.sound();
    }
}
