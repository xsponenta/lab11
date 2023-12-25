package Task2;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class MailInfo {

    private MailType mailType;
    @Getter
    @Setter
    private Client client;

    public String generateMail() {
        return String.format("Some e-mail, %s", mailType.toString());
    }
}