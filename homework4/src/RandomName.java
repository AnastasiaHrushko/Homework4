import java.util.Random;

public class RandomName {

        public String randomName() {
            Random random = new Random();
            StringBuilder name = new StringBuilder();
            int i = random.nextInt(5) + 1;
            for (int j = 0; j < i; j++) {
                char c = (char) random.nextInt('a', 'z' + 1);
                name.append(c);
            }
            return name.toString();
        }
}
