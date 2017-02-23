package idv.carl.sample.singleton;

import java.time.LocalDateTime;

/**
 * @author Carl Lu
 */
public class Job {

    private Long id;
    private String name;
    private LocalDateTime createDateTime;

    public static Job getInstance() {
        return new Job();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getCreateDateTime() {
        return createDateTime;
    }

    public void setCreateDateTime(LocalDateTime createDateTime) {
        this.createDateTime = createDateTime;
    }
}
