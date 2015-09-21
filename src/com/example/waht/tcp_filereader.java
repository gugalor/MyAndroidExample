package com.example.waht;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
public class tcp_filereader {
    public static void main(String[] args) {
        FileWriter FW = null;
        try {
            FW = new FileWriter("demo.txt", true);
            FW.write("abcd");
        } catch (IOException E) {
            System.out.println(E.toString());
        } finally {
            if (FW != null)
                try {
                    FW.close();
                } catch (IOException e) {
                    System.out.println(e.toString());
                }
        }
    }
}

    class FileReaderDemo2 {
        public static void main(String[] args) throws IOException {
            FileReader fr = new FileReader("demo.txt");
            char[] buf = new char[1024];
            int len = 0;
            while ((len = fr.read(buf)) != -1) {
                System.out.println(new String(buf, 0, len));
            }
            fr.close();
        }
    }

    class TcpClient {
        public static void main(String[] args) throws Exception {
            Socket s = new Socket("10.1.31.69", 10001);
            OutputStream out = s.getOutputStream();
            out.write("tcp演示，哥们又来了！".getBytes());
            s.close();
        }
    }

    class TcpServer {
        public static void main(String[] args) throws Exception {
            ServerSocket ss = new ServerSocket(10001);
            Socket s = ss.accept();//获取客户端对象
            String ip = s.getInetAddress().getHostAddress();
            System.out.println("print" + ip);
            InputStream in = s.getInputStream();
            byte[] buf = new byte[1024];
            int len = in.read(buf);
            String text = new String(buf, 0, len);
            System.out.println(text);
            s.close();
            ss.close();
        }
    }





