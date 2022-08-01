public class ForStart {
    public static void main(String[] args) {
        firstMethod();
        secondMethod();
        thirdMethod();
        fourthMethod();
    }

    public static void firstMethod() {
        Cat cat = new Cat();
        int kolichestvo = 0;
        while (kolichestvo < 10) {
            kolichestvo++;
            System.out.println(cat);
        }
    }

    public static void secondMethod() {
        for (int i = 0; i <= 10; i++) {
            RandomName randomName = new RandomName();
            int randomAge = (int) (1+ Math.random()*28);
            Cat cat = new Cat();
            cat.setName(randomName.randomName());
            cat.setAge(randomAge);
            System.out.println("Cat name is " + cat.getName() + ", age - " + cat.getAge());
        }
    }

    public static void thirdMethod() {
        RandomName randomName = new RandomName();
        int randomAge = (int) (1+ Math.random()*28);
        Cat cat = new Cat();
        int kolichestvo = 0;
        do {
            cat.setName(randomName.randomName());
            cat.setAge(randomAge);
            System.out.println(cat.toString());
            kolichestvo++;
        } while (kolichestvo < 10);
    }

    public static void fourthMethod() {
        RandomName randomName = new RandomName();
        int randomAge = (int) (1+ Math.random()*28);
        Cat[] cat5 = { new Cat(), new Cat(), new Cat(), new Cat(), new Cat()};
        for (Cat cat: cat5) {
            System.out.println(cat);
        }
    }
}
