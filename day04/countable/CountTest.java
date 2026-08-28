package countable;

public class CountTest {
    public static void main(String[] args) {
        Countable[] array = { 
            new Bird("뻐꾸기", 5), 
            new Bird("독수리", 2), 
            new Tree("사과나무", 10), 
            new Tree("밤나무", 7) 
        };

        for (Countable c : array) {
            c.count(); 
        }

        for (Countable c : array) {
            if (c instanceof Bird) {
                Bird bird = (Bird) c;
                bird.fly();
            } else if (c instanceof Tree) {
                Tree tree = (Tree) c;
                tree.ripen();
            }
        }
    }
}