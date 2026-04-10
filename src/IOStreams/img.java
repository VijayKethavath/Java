package IOStreams;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class img {

    public static void main(String[] args) throws IOException {
        var fis = new FileInputStream("C:\\Users\\ketha\\OneDrive\\Pictures\\39c619f62cb487305566608257305afd.jpg");
        var fos = new FileOutputStream("C:\\Users\\ketha\\OneDrive\\Pictures\\res.jpg");
        int i;
        while ((i = fis.read()) != -1) {
            fos.write(i);  
        }
        fis.close();
        fos.close();  
        System.out.println("ok");
        
    }
}