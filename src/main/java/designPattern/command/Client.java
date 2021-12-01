package designPattern.command;

public class Client {
    public static void main(String[] args) {
        Lamp lamp = new Lamp();
        Command lampOnCommand = new LampOnCommand(lamp);

        Alarm alarm = new Alarm();
        Command alarmStartCommand = new AlarmStartCommand(alarm);

        // 램프 켜는 Command 설정
        Button button1 = new Button(lampOnCommand);
        button1.pressend();

        // 알람 시작하는 Command 설정
        Button button2 = new Button(alarmStartCommand);
        button2.pressend();
        
        // 다시 램프 켜는 Command 설정
        button2.setCommand(lampOnCommand);
        button2.pressend();
    }
}
