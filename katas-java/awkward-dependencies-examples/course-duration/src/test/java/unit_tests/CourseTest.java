package unit_tests;

import static org.assertj.core.api.Assertions.assertThat;

import course_duration.Course;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class CourseTest {

    private Course course;

    @BeforeEach
    public void SetUp() {
        course = new Course("macramé");
    }

    @Test
    public void identifies_short_courses() {
        course.start();
        course.end();

        assertThat(course.isShort()).isEqualTo(true);
    }

    @Test
    @Disabled("pending")
    public void identifies_long_courses() {
    }

    @Test
    @Disabled("pending")
    public void knows_the_course_title() {
    }
}

