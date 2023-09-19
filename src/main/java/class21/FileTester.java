package class21;

public class FileTester {
    public static void main(String[] args) {
        File [] arr= {new JavaFile(), new WordFile(), new PdfFile()};
        for (File f:arr){
            f.open();
            f.edit();
            f.close();
            f.name();
            f.size();
        }
    }
}
