package home.netology.javacore.multithreadingprogramming.clientserver.task1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try (ServerSocket server = new ServerSocket(24445)) {
            Socket socket = server.accept();
            // канал записи в сокет
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
            // канал чтения из сокета
            DataInputStream dis = new DataInputStream(socket.getInputStream());

            // начинаем диалог с подключенным клиентом в цикле, пока сокет не закрыт
            while (!socket.isClosed()) {
                // ждем получения данных клиента
                String entry = dis.readUTF();
                // если условие окончания работы не верно - продолжаем работу - отправляем эхо-ответ  обратно клиенту
                if (entry.equals("end")) {
                    dos.writeUTF("Пока!");
                    dos.flush();
                    System.exit(11);
                }
                try {
                    dos.writeUTF("Результат вычисления Фибоначчи для числа " + entry + ": "+ calculateFibonachi(Integer.parseInt(entry)));
                    dos.flush();
                } catch (Exception exception) {
                    dos.writeUTF("Ты прислал не число!");
                    dos.flush();
                    continue;
                }
            }
            // если условие выхода - верно выключаем соединения
            // закрываем сначала каналы сокета !
            dis.close();
            dos.close();
            // потом закрываем сам сокет общения на стороне сервера!
            socket.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static int calculateFibonachi(int number) {
            if (number <= 1) {
                return number;
            }
            return calculateFibonachi(number - 2) + calculateFibonachi(number - 1);
    }
}
