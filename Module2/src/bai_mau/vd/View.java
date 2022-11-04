package bai_mau.vd;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class View {
    public List<MainPosts> readFile(String filePath) {
        List<MainPosts> list = new ArrayList<>();
        File file = new File(filePath);
        FileReader fileReader;
        BufferedReader br;
        String line;
        String[] array;
        try {
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            fileReader = new FileReader(file);
            br = new BufferedReader(fileReader);
            while ((line = br.readLine()) != null) {
                array = line.split(",");
                MainPosts mainPost = new MainPosts(Integer.parseInt(array[0]), array[1], array[2], array[3], Integer.parseInt(array[4]));
                list.add(mainPost);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public void writeFile(List<MainPosts> list, String filePath) {
        File file = new File(filePath);
        FileWriter fileWriter;
        BufferedWriter bw;
        try {
            fileWriter = new FileWriter(file);
            bw = new BufferedWriter(fileWriter);
            for (MainPosts mainPosts : list) {
                bw.write(mainPosts.getInfo());
                bw.newLine();
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        List<MainPosts> list = new ArrayList<>();
        list.add(new MainPosts(1, "Thiên nhiên", "Cây có màu gì", "Cây có màu xanh", 5));
        list.add(new MainPosts(2, "Đồ vật", "Cái ghế có mấy chân", "cái ghế có 3 chân", 10));
        list.add(new MainPosts(2, "Xe", "Xe có bao nhiêu bánh", "Xe có 3 bánh", 1000));

        View view = new View();
        view.writeFile(list, "src/bai_mau/vd/File.csv");
        List<MainPosts> mainPosts = view.readFile("src/bai_mau/vd/File.csv");
        for (MainPosts mainPost : mainPosts) {
            System.out.println(mainPost);
        }
    }
}
