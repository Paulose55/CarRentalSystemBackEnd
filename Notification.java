package za.ac.cput.domain;
//Sinothando Masiki 219153841

import java.util.Date;

public class Notification {

    private String notificationId;
    private String message;
    private String sentDate;
    private boolean isRead;
    private String recipient;

    private Notification(Builder builder) {
        this.notificationId = builder.notificationId;
        this.message = builder.message;
        this.sentDate = builder.sentDate;
        this.isRead = builder.isRead;
        this.recipient = builder.recipient;
    }
    // Constructors

    public Notification(String notificationId, String message, String sentDate, boolean isRead, String recipient) {
        this.notificationId = notificationId;
        this.message = message;
        this.sentDate = sentDate;
        this.isRead = isRead;
        this.recipient = recipient;
    }

    // Getters and Setters
    public String getNotificationId() {
        return notificationId;
    }

    public String getMessage() {
        return message;
    }

    public String getSentDate() {
        return sentDate;
    }


    public boolean isRead() {
        return isRead;
    }

    public String getRecipient() {
        return recipient;
    }


    public static class Builder {
        private String notificationId;
        private String message;
        private String sentDate;
        private boolean isRead;
        private String recipient;

        public Builder(String notificationId) {

            this.notificationId = notificationId;
        }

        public Builder message(String message) {
            this.message = message;
            return this;
        }

        public Builder sentDate(String sentDate) {
            this.sentDate = sentDate;
            return this;
        }

        public Builder isRead(boolean isRead) {
            this.isRead = isRead;
            return this;
        }

        public Builder recipient(String recipient) {
            this.recipient = recipient;
            return this;
        }

        public Notification.Builder copy(Notification notification) {
            this.notificationId = notification.notificationId;
            this.message = notification.message;
            this.sentDate = notification.sentDate;
            this.isRead = notification.isRead;
            this.recipient = notification.recipient;
            return this;
        }

        public Notification build() {
            return new Notification(this);
        }

        // toString method
        @Override
        public String toString() {
            return "Notification{" +
                    "notificationId='" + notificationId + '\'' +
                    ", message='" + message + '\'' +
                    ", sentDate=" + sentDate +
                    ", isRead=" + isRead +
                    ", recipient=" + recipient +
                    '}';
        }
    }
}