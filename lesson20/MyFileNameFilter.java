package lesson20;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class MyFileNameFilter implements FilenameFilter {
    @Override
    public boolean accept(File dir,String name) {
        return name.contains("О") ? true : false;
    }
}
