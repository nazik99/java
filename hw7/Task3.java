import java.util.Random;

public class Task3 {
    public static String[] events = {"������ ���",
                                    "���������� � ������� � ����� ����",
                                    "���������� � ������� � ������ ����",
                                    "����� � �������",
                                    "�������� �� �����",
                                    "���.������� �� �������",
                                    "���� ������� ����",
                                    "������� ������� �������",
                                    "������ ��������� �����",
                                    "�������� ������",
                                    "��������� �� ������ ������",
                                    "��������� �� ������ �� ���������",
                                    "��������� �� ������ �� ����� ����",
                                    "������� �������",
                                    "��������� �� ������",
                                    "�����"
                                    }
    public static void main(String[] args) {
        System.out.println(getEvent());
    }

    public static String getEvent(int max, int min, int event1, int event2){
        Random rnd = new Random();
        int random = rnd.nextInt(max)+1;
        if(random <= min){
            return events[event1];
        }
        else{
            return events[event2];
        }
    }
    public static void chooseEvent(Stream event) {
        switch (event) {
            case "������ ���";
            print(event);
            Stream nextEvent = getEvent(2, 1, 1, 2);
        }
    }
    public static void print(String msg){
        System.out.println(msg);
    }
}