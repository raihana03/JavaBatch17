package class21;
/*
Create a class File that will have the following behaviors: open(), edit(), close()
and fields like name and size. Edit and close are implemented method while open is an abstract.
 Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide specific implementation of
 open behaviour: Example: to open .java file we need notepad++
 or sublime text, to open .doc file we need Microsoft word to be installed etc.Create a tester
 class and call all of the methods from these classes.
 */
public abstract class File1 {

    private String name;
    private int size;
    public File1(String name, int size){
        this.name= name;
        this.size=size;
    }
    public abstract void open();
    public void edit(){
        System.out.println("Editing the file "+ name);
    }
    public void close(){
        System.out.println("Closing the file "+ name);
    }
}
class JavaFile1 extends File1{
    public JavaFile1(String name, int size) {
        super(name, size);
    }
    @Override
    public void open() {
        System.out.println("Opening javaFile using IntelliJ");
    }
}
class WordFile1 extends File1{
    public WordFile1(String name, int size) {
        super(name, size);
    }
    @Override
    public void open() {
        System.out.println("Using Microsoft word to open Word file");
    }
}
class PdfFile1 extends File1{

    public PdfFile1(String name, int size) {
        super(name, size);
    }

    @Override
    public void open() {
        System.out.println("Using PDF to open PDF file");
    }
}