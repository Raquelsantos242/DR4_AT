package infnet.selenium;

public class App 
{
        public static void main(String[] args) {
            NotificationService service = new NotificationService();

            NotificationChannel email = new EmailNotification();
            NotificationChannel sms = new SmsNotification();
            NotificationChannel push = new PushNotification();

            service.notifyUser(email, "Welcome to our platform!");
            service.notifyUser(sms, "Your verification code is 123456.");
            service.notifyUser(push, "You have a new message.");
        }
    }


