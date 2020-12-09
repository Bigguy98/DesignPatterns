package main.creational.prototype;

public class Main {
    public static void main(String[] args) {
        Computer standardComputer = new Computer("Win 10", "Microsoft office", "Bkabv", "Chrome", "None");

        Computer tungComputer = (Computer) standardComputer.clone();
        if (tungComputer != null) {
            tungComputer.setOthers("Netbeans, Notepad, Intellij, VsCode");
        }
        System.out.println(tungComputer);
    }
}
