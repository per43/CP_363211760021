package Lab9;

import com.sun.xml.internal.bind.api.impl.NameConverter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ExFileWriter {

    public static void main(String[] args) {

        Path myPath =  Paths.get("C:/Users/LabCom_MT-4/Documents/myFileCP/Test.txt");
        BufferedWriter writer = null;

        try {
            writer = Files.newBufferedWriter(myPath, StandardCharsets.UTF_8, StandardOpenOption.APPEND);

            writer.write("Nithiwat Wechakama");
            writer.newLine(); //

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }



}
