package pl.sdacademy.beginner.reader;

public abstract class Reader {

    protected String url;

    public Reader(String url) {
        this.url = url;
    }

    public String getPage() {
        read();
        System.out.println(read());
        System.out.println("Parsing");
        return "web page";
    }

    protected abstract String read();
}
