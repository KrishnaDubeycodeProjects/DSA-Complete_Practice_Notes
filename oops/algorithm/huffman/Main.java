package dsa.oops.algorithm.huffman;

import java.io.*;
import java.util.*;

public class Main implements Serializable{
    class huffman  implements Serializable {
        Map<Character, String> encode = new HashMap<>();
        Map<String, Character> decode = new HashMap<>();
    }

    static huffman ok = new Main().new huffman();

    static class Node {
        char data;
        int d;
        Node left;
        Node right;
    }

    private static Node encode(String data) {
        Map<Character, Integer> freq = new HashMap<>();
        for (int i = 0; i < data.length(); i++) {
            freq.merge(data.charAt(i), 1, Integer::sum);
        }
        PriorityQueue<Node> obj = new PriorityQueue<>((n1, n2) -> n2.d - n1.d);
        for (char a : freq.keySet()) {
            Node obj1 = new Node();
            obj1.data = a;
            obj1.d = freq.get(a);
            obj.offer(obj1);
        }
        while (!obj.isEmpty()) {
            Node get = obj.poll();
            if (obj.isEmpty()) return get;
            Node get2 = obj.poll();
            Node ne = new Node();
            ne.d = get2.d + get.d;
            ne.left = get;
            ne.right = get2;
            obj.add(ne);
        }
        return null;
    }

    public static void encod(String data) {
        Node f = encode(data);
        if (f == null) return;
        tree(f, "");
    }

    static void tree(Node f, String d) {
        if (f.data != '\0') {
            ok.encode.put(f.data, d);
            ok.decode.put(d, f.data);
            return;
        }
        tree(f.left, d + "0");
        tree(f.right, d + "1");
    }

    static void huffmanCoding(String data) {
        encod(data);
    }
        static String readHuffman(huffman obj , String data){
        ok  = obj;
        StringBuilder p  =new StringBuilder();
            for (int i = 0; i < data.length(); i++) {
                String s = data.charAt(i)+"";
               while (ok.decode.get(s)==null){
                   i++;
                   s+=data.charAt(i);
               }
                p.append(ok.decode.get(s));
            }
            return p.toString();
        }
    static void readHuffman(ObjectInputStream objectInputStream , FileReader reader,File ho) throws IOException, ClassNotFoundException {
        StringBuilder o= new StringBuilder();
        while (reader.ready()){
           o.append(reader.read());
        }
        huffman obj =(huffman) objectInputStream.readObject();

        FileWriter oj = new FileWriter(ho);
        oj.write(readHuffman(obj,o.toString()));
        oj.close();
    }
    public static void write()throws IOException{
        File obj1 = new File("./src/main/java/dsa/oops/algorithm/huffman/" + "mytest.dat");
        File obj2 = new File("./src/main/java/dsa/oops/algorithm/huffman/" + "s.txt");
        BufferedReader l = new BufferedReader(new InputStreamReader((System.in)));
        StringTokenizer tokenizer=null ;
        try (  FileWriter o = new FileWriter(obj2); ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream(obj1))) {
       do {
           StringBuilder data = new StringBuilder();
           while (tokenizer == null || !tokenizer.hasMoreElements()) {
               tokenizer = new StringTokenizer(l.readLine(), " ");
           }

           while (tokenizer.hasMoreElements()) {
               data.append(tokenizer.nextToken());
           }

           huffmanCoding(data.toString());
           StringBuilder okk = new StringBuilder();
           for (int i = 0; i < data.length(); i++) {
               okk.append(ok.encode.get(data.charAt(i)));
           }
           obj.writeObject(ok);
           for (int i = 0; i < okk.length(); i++) {
               o.write(Integer.parseInt(okk.charAt(i)+""));
           }
       }while(l.ready());
        }
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File obj1 = new File("./src/main/java/dsa/oops/algorithm/huffman/" + "mytest.dat");
        File obj2 = new File("./src/main/java/dsa/oops/algorithm/huffman/" + "s.txt");
        Scanner sc=  new Scanner(System.in);
        int t=0;
        do{
            System.out.println("Welcome Enter your data to compress it:");
             t =sc.nextInt();
             switch (t){
                 case 1:
                     System.out.println("Enter data : ");
                     write();
                     break;
                 case 2:
                     readHuffman(new ObjectInputStream(new FileInputStream(obj1)),new FileReader(obj2),obj2);
                     break;
                 case 0:
                     break;
                 default:
                     throw new IllegalStateException("Unexpected value: " + t);
             }
        }while(t!=0);
    }
}