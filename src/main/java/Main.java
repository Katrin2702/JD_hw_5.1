public class Main {

    public static void main(String[] args) {

        new Thread(new MyServer()::calculation).start();
        new Thread(new Client()::calculationQuery).start();

    }

}
