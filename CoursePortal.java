class Course {
    private String title;
    private int duration; // in hours
    private String instructor;

    public Course(String title, int duration, String instructor) {
        this.title = title;
        this.duration = duration;
        this.instructor = instructor;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String getCourseInfo() {
        return "Title: " + title + ", Duration: " + duration + " hours, Instructor: " + instructor;
    }
}

class LiveCourse extends Course {
    private String scheduleTime;

    public LiveCourse(String title, int duration, String instructor, String scheduleTime) {
        super(title, duration, instructor);
        this.scheduleTime = scheduleTime;
    }

    public String getScheduleTime() {
        return scheduleTime;
    }

    public void setScheduleTime(String scheduleTime) {
        this.scheduleTime = scheduleTime;
    }

    @Override
    public String getCourseInfo() {
        return super.getCourseInfo() + ", Schedule Time: " + scheduleTime;
    }
}

class RecordedCourse extends Course {
    private int videoCount;

    public RecordedCourse(String title, int duration, String instructor, int videoCount) {
        super(title, duration, instructor);
        this.videoCount = videoCount;
    }

    public int getVideoCount() {
        return videoCount;
    }

    public void setVideoCount(int videoCount) {
        this.videoCount = videoCount;
    }

    @Override
    public String getCourseInfo() {
        return super.getCourseInfo() + ", Video Count: " + videoCount;
    }
}

public class CoursePortal {
    public static void main(String[] args) {
        Course live = new LiveCourse("Java Programming", 40, "Coder", "Mon & Wed 7-9 PM");
        Course recorded = new RecordedCourse("Python ", 25, "Klm", 50);

        System.out.println(live.getCourseInfo());
        System.out.println(recorded.getCourseInfo());
    }
}
