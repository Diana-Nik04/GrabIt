package home.work.service;

import home.work.entity.Screen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOServiceImpl implements IOService {
    private Screen screen;
    private BufferedReader reader;

    public IOServiceImpl() {
        this.screen = new Screen();
        reader = new BufferedReader(new InputStreamReader(System.in));
    }

    @Override
    public int readInt() {
        try {
            return Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            System.out.println("Неизвестная ошибка");
            return readInt();
        }
    }

}
