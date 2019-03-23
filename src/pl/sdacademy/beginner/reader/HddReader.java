package pl.sdacademy.beginner.reader;

public class HddReader extends Reader {

    public HddReader(String url) {
        super(url);
    }

    @Override
    protected String read() {
        return "Czytam z hdd strone + " + url;
    }

}
