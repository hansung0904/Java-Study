package polymorphism.interfacepractice;

public class HTMLParser implements Parseable {

    public void parse(String fileName) {
        System.out.println(fileName + "-HTML Parsing completed");
    }
}
