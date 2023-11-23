package mailNotification;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void musNotifyUser(){
        Newsletter newsletter = new Newsletter("nova mensagem");
        User user = new User("Thiago");
        user.signIn(newsletter);
        newsletter.lauchNew();
        assertEquals("Nova mensagem para Thiago:nova mensagem", user.getLastNotification());
    }

    @Test
    void musNotNotifyUser(){
        Newsletter newsletter = new Newsletter("nova mensagem");
        User user = new User("Thiago");
        newsletter.lauchNew();
        assertNull(user.getLastNotification());
    }
}