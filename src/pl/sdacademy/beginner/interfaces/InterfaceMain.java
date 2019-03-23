package pl.sdacademy.beginner.interfaces;

public class InterfaceMain {
    public static void main(String[] args) {
        Reader internetReader = new InternetReader();
        HddReader hddReader = new HddReader();
        printPage(hddReader);
        printPage(internetReader);
        introduce(hddReader);
        some("");
        some("", "adqsdeqw");
        some("", "adqsdeqw", "dwqeqw");
    }

    public static void printPage(Reader r ){
        System.out.print(r.read());
    }

    public static void introduce(Printable p){
        p.print();
        p.printShort();
    }

    public static void some(String b, String ... a){
    }
}
