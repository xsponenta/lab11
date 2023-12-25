package Task2;

import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;

import java.util.List;

public class MailBox {

    private List<MailInfo> infos;

    public void addMailInfo(MailInfo maiInfo) {
        this.infos.add(maiInfo);
    }

    public void sendAllEmails() throws MailjetException, MailjetSocketTimeoutException {
        MailSender mailSender = new MailSender();
        for (MailInfo info: infos) {
            mailSender.send(info);
        }
    }

}

