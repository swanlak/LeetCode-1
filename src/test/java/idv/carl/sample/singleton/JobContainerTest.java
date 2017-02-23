package idv.carl.sample.singleton;

import static org.junit.Assert.assertEquals;

import java.time.LocalDateTime;

import org.junit.Test;

/**
 * @author Carl Lu
 */
public class JobContainerTest {

    @Test
    public void test() {
        Job job1 = Job.getInstance();
        job1.setId(1l);
        job1.setName("RuRu run run");
        job1.setCreateDateTime(LocalDateTime.now());

        Job job2 = Job.getInstance();
        job2.setId(2l);
        job2.setName("MaoMao pa pa");
        job2.setCreateDateTime(LocalDateTime.now());

        JobContainer jobContainer = JobContainer.INSTANCE;
        jobContainer.getJobMap().put("J1", job1);
        jobContainer.getJobMap().put("J2", job2);

        assertEquals(2, JobContainer.INSTANCE.getJobMap().size());
    }

}
