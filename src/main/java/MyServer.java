import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {

    public void calculation() {
        try (ServerSocket servSocket = new ServerSocket(23444);
             Socket socket = servSocket.accept();
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
            out.println(fibonacciNumber(Integer.parseInt(in.readLine())));
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }


    public int fibonacciNumber(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        } else {
            int n0 = 1;
            int n1 = 1;
            int n2 = 0;
            for (int i = 3; i <= n; i++) {
                n2 = n0 + n1;
                n0 = n1;
                n1 = n2;
            }
            return n2;
        }
    }

}
