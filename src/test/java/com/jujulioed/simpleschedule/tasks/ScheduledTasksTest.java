package com.jujulioed.simpleschedule.tasks;

import org.awaitility.Durations;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.bean.override.mockito.MockitoSpyBean;

import java.util.concurrent.TimeUnit;

import static org.awaitility.Awaitility.await;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.verify;

@SpringBootTest
@TestPropertySource(properties = "task.work.rate=100")
public class ScheduledTasksTest {

    @MockitoSpyBean
    ScheduledTasks tasks;

    @Test
    public void reportCurrentTime() {
        await().atMost(10, TimeUnit.SECONDS).untilAsserted(() -> {
            verify(tasks, atLeast(2)).reportCurrentTime();
        });
    }

    @Test
    public void testFunctionCurrentTime() {

    }
}
