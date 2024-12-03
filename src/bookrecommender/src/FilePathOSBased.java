package bookrecommender.src;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



public class FilePathOSBased {

    public String getFilePath(){
        String os = System.getProperty("os.name").toLowerCase();

        if(os.contains("win")){
            //rimpiazzare con absolute path della directory "DATA" del vostro computer.
            return "";

        } else if(os.contains("nix") || os.contains("nux")) {
            //rimpiazzare con absolute path della directory "DATA" sul vostro computer.
            return null;

        } else if(os.contains("mac")) {

            //rimpiazzare con absolute path della directory "DATA" sul vostro computer.
            return "/Users/fil/Desktop/prog2024/BookRecomender/src/bookrecommender/data/";
        }
        else{
            return null ;

        }
    }

    public FilePathOSBased() {
        getFilePath();


    }

}
