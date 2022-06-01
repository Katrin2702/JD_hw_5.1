import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    Scanner scanner = new Scanner(System.in);

    public void calculationQuery() {
        try {
            Socket socket = new Socket("127.0.0.1", 23444);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);
            System.out.println("Введите целое число");
            int n = scanner.nextInt();
            out.println(n);
            System.out.println(n + "-ый член ряда Фибоначчи равен " + in.readLine());
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }


}




