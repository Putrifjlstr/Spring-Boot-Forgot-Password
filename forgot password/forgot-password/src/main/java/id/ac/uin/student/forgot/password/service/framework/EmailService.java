package id.ac.uin.student.forgot.password.service.framework;

import id.ac.uin.student.forgot.password.entity.Mail;

public interface EmailService {
    void send(Mail mail);
}