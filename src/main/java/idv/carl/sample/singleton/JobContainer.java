package idv.carl.sample.singleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Carl Lu
 */
public enum JobContainer {
    INSTANCE;

    private static Map<String, Job> jobMap = new ConcurrentHashMap<>();

    public Map<String, Job> getJobMap() {
        return jobMap;
    }
}
