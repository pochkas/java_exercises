import javax.xml.stream.events.Characters;
import java.nio.charset.Charset;

public class Exercise40 {

    public static void main(String[] args) {

        for(String s: Charset.availableCharsets().keySet()){
            System.out.println(s);
        }

    }

}
