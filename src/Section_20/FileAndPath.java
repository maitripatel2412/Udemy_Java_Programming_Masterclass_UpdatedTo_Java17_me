package Section_20;

import java.io.File;
import java.io.IOException;

public class FileAndPath {

    public static void main(String[] args) {

        useFile("testfile.txt");

    }

    private static void useFile(String fileName){

        File file = new File(fileName);
        boolean fileExists = file.exists();

        System.out.printf("file '%s' %s%n", fileName, fileExists ? "exists." : "does not exist.");

        if (fileExists){
            System.out.println("deleting file: " + fileName);
            fileExists = !file.delete();
        }
        if (!fileExists) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println("something went wrong");
            }
            System.out.println("created file : " + fileName);
            if (file.canWrite()){
                System.out.println("would write to file here");
            }
        }
        }

    }

