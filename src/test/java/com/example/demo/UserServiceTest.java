package com.example.demo;

import com.example.task_job.model.User;
import com.example.task_job.service.UserService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class UserServiceTest {

    @Test
    void testCreateUser() {
        User user = new User();
        user.setName("John");
        user.setEmail("john@example.com");
        user.setAge(30);
        user.setWeight(75);
        user.setHeight(175);
        user.setGoal(User.Goal.Похудение);

        UserService userService = Mockito.mock(UserService.class);
        Mockito.when(userService.createUser(user)).thenReturn(user);

        User createdUser = userService.createUser(user);
        assertNotNull(createdUser);
        assertEquals("John", createdUser.getName());
    }
}

