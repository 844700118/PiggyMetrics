package com.chenym.notification.service;


import com.chenym.notification.domain.NotificationType;
import com.chenym.notification.domain.Recipient;

import javax.mail.MessagingException;
import java.io.IOException;

public interface EmailService {

    void send(NotificationType type, Recipient recipient, String attachment) throws MessagingException, IOException;

}
