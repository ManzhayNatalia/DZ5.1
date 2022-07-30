package ru.netology.sqr;
public class SQRService {
    public int calculate(int x, int y) {
        int cnt = 0;
        for (int i = 10; i <= 99; i = (i + 1)) {
            if (i * i >= x && i * i <= y) {
                cnt++;
            }
        }
        System.out.println(cnt);
        return cnt;


    }

}
