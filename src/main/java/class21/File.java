package class21;

public abstract class File {
    abstract void open();
    abstract void edit();
    abstract void close();
    abstract void name();
    abstract void size();
}
class JavaFile extends File{

    public JavaFile(String s, int i) {
        super();
    }

    public JavaFile() {

    }

    @Override
    void open() {
        System.out.println("Open notepad++ to access .java file");
    }
    @Override
    void edit() {
        System.out.println("Edit file");
    }
    @Override
    void close() {
        System.out.println("Close file");
    }
    @Override
    void name() {
        System.out.println("Name file");
    }
    @Override
    void size() {
        System.out.println("Size of the file");
    }
}
class WordFile extends File{

    @Override
    void open() {
        System.out.println("Open Microsoft to access .doc file");
    }
    @Override
    void edit() {
        System.out.println("Edit file");
    }
    @Override
    void close() {
        System.out.println("Close file");
    }
    @Override
    void name() {
        System.out.println("Name file");
    }
    @Override
    void size() {
        System.out.println("Size of the file");
    }
}
class PdfFile extends File{

    @Override
    void open() {
        System.out.println("Open Adobe to access .pdf file");
    }
    @Override
    void edit() {
        System.out.println("Edit file");
    }
    @Override
    void close() {
        System.out.println("Close file");
    }
    @Override
    void name() {
        System.out.println("Name file");
    }
    @Override
    void size() {
        System.out.println("Size of the file");
    }
}