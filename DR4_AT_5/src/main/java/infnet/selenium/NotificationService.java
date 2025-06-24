package infnet.selenium;

public class NotificationService {
    public void notifyUser(NotificationChannel channel, String message) {
        channel.send(message);
    }
}

