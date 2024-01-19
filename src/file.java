import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class file {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String folder = sc.nextLine();
        String path = "C:\\Users\\ASUS\\OneDrive\\Desktop\\"+folder;
        File f = new File(path);
        f.mkdir();
        f = new File(path+"\\index.html");
        f.createNewFile();
        FileWriter fw = new FileWriter(f);
        fw.append("<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <title>Document</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "\n"+
                "    <script src=\"script.js\"></script>\n" +
                "</body>\n" +
                "</html>");
        fw.close();

        f = new File(path+"\\style.css");
        f.createNewFile();
        fw = new FileWriter(f);
        fw.append("*{\n" +
                "    margin: 0;\n" +
                "    padding: 0;\n" +
                "    box-sizing: border-box;\n" +
                "}\n" +
                "html,body{\n" +
                "    width: 100%;\n" +
                "    height: 100%;\n" +
                "}");
        fw.close();

        f = new File(path+"\\script.js");
        f.createNewFile();
        System.out.println("Folder Created Successfully!");
    }
}
