package infnet.selenium;

public class App 
{
        public static void main(String[] args) {
            NotificationService service = new NotificationService();

            NotificationChannel email = new EmailNotification();
            NotificationChannel sms = new SmsNotification();
            NotificationChannel push = new PushNotification();

            service.notifyUser(email, "email message");
            service.notifyUser(sms, "sms message");
            service.notifyUser(push, "push message");
        }
    }

