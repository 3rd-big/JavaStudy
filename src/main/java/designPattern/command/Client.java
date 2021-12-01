package designPattern.command;

public class Client {
    public static void main(String[] args) {
        Lamp lamp = new Lamp();
        Command lampOnCommand = new LampOnCommand(lamp);

        Alarm alarm = new Alarm();
        Command alarmStartCommand = new AlarmStartCommand(alarm);

        // ���� �Ѵ� Command ����
        Button button1 = new Button(lampOnCommand);
        button1.pressend();

        // �˶� �����ϴ� Command ����
        Button button2 = new Button(alarmStartCommand);
        button2.pressend();
        
        // �ٽ� ���� �Ѵ� Command ����
        button2.setCommand(lampOnCommand);
        button2.pressend();
    }
}
