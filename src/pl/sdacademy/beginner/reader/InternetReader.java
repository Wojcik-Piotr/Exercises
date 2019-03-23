package pl.sdacademy.beginner.reader;

public class InternetReader extends Reader {

    public InternetReader(String url) {
        super(url);
    }

    protected String read() {
        return "Czytam z internetu " + url;
    }
}
