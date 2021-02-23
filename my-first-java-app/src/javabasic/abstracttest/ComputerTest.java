package javabasic.abstracttest;

public class ComputerTest {
    public static void main(String[] args) {

        Computer computer = new Desktop();
        computer.turnOn();
        computer.display();
        computer.typiing();
        computer.turnOff();

        NoteBook myNote = new MyNoteBook();
        myNote.turnOn();
        myNote.display();
        myNote.typiing();
        myNote.turnOff();
    }
}
