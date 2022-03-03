package lesson25;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class UsdToRubleService {

    public static UsdToRuble getActual() {

        return new UsdToRuble(Double.valueOf(readFromFile()));
    }


    public static String readFromFile() {

        try (BufferedReader br = new BufferedReader(new FileReader("usd.txt"))) {

            StringBuilder sb = new StringBuilder();
            String currentLine = "";
            while ((currentLine = br.readLine()) != null) {
                System.out.println(currentLine);
                if (currentLine != null && currentLine.isBlank())
                    sb.append(currentLine);
            }
            return sb.toString();
        } catch (IOException e) {
            e.printStackTrace();

        }
        return null;
    }
}
