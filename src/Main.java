
public class Main {
    public static void main(String[] args) {
        String myString = "AP CSA is awesome! ";
        StringBuilder textBlock = new StringBuilder();
        int iterations = 30;
        int sectionSize = 100;
        int shift = 3;

        int loops = (int) Math.ceil((double) (iterations * shift + sectionSize - 1) / myString.length());
        String loopString = myString.repeat(loops);

        for (int i=0; i<iterations * shift; i+=shift) {
            textBlock.append(loopString, i, i + sectionSize).append("\n");
        }

        System.out.print(textBlock);
    }
}
