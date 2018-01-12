package clinic.programming.training;
import java.util.stream.IntStream;
import org.apache.commons.lang3.StringUtils;

public class Application {
    
    public Application() {
        System.out.println ("Inside Application");
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
		Application app = new Application();
		
		int[] values = {4,6,2,3,8,9,1,0};
        IntStream.of(values).forEach(value -> System.out.printf("%d ", value));
        System.out.println(IntStream.of(values).count());
        System.out.println(IntStream.of(values).sum());
        System.out.println(IntStream.of(values).max());
        
        String[] separateWords = org.apache.commons.lang3.StringUtils.split("abcd egffl and", ' ');
        System.out.println("separateWords: " + separateWords);
        
    }
}