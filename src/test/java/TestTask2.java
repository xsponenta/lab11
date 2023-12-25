import Task2.Gender;
import Task2.Client;
import Task2.MailInfo;
import Task2.MailType;
import org.junit.Assert;
import org.junit.Test;

public class TestTask2 {
    @Test
    public void testMail(){
        MailInfo mailInfo = new MailInfo();
        mailInfo.setMailType(MailType.GIFT);
        mailInfo.setClient(new Client("Nazar", 20, Gender.MALE));
        String mail = mailInfo.generateMail();
        Assert.assertEquals(mail, "Some e-mail, GIFT");
    }
}
