package pl.sdacademy.beginner.reader;

public class Main {
    public static void main(String[] args) {
        new Main().start();
    }

    public void start() {
        String address = "www.google.com";

        Reader reader;
        if (address.startsWith("www"))
            reader = new InternetReader(address);
        else reader = new HddReader(address);

        showWebPage(reader);
    }

    public void showWebPage(Reader reader) {
        System.out.println(reader.getPage());

    }

}
