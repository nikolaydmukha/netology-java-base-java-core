package home.netology.javacore.multithreadingprogramming.clientserver.task2;

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
                dos.writeUTF("Получили строку: " + entry + ". Строка без пробелов: " + whiteSpacesRemover(entry));
                dos.flush();
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

    private static String whiteSpacesRemover(String input) {
        return input.replaceAll("\\s+","");
    }
}
