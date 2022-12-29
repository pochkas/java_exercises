import java.math.BigDecimal;
import java.math.RoundingMode;

public class Exercise13 {

    double width = 5.6;
    double height = 8.5;

    double perimeter = 2 * (width + height);
    double scale = Math.pow(10, 2);
    double area = Math.ceil(width * height * scale) / scale;
}
