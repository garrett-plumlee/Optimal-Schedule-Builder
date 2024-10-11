package edu.uga.devdogs.bulletin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Controller for handling requests related to the UGA Bulletin service.
 * Provides information on course ID, course title, course description,
 * and semesters offered.
 */
@RestController
@RequestMapping("/api/bulletin")
public class BulletinController {

    /**
     * Retrieves course information based on the provided course ID.
     *
     * @param courseId The ID of the course to retrieve. (e.g., "CSCI-1301")
     * @return A "Course" List containing the course information (ID, title, description, semester).
     */
    @GetMapping("/course")
    public List<Course> getCourseInfo(@RequestParam String courseId) {
        // TODO: Replace with actual service layer calls and implement the Course class
        List<Course> courseList = new ArrayList<>();



        return courseList;
    }


    /**
     * Retrieves a list of courses based on the specified parameters. For example, you can edit this function to query
     * with your required parameters such as credit Hours and add on additional optional ones like,
     * "Give me all the 4 credit hours CSCI classes"
     *
     * @author Raghav Vikramprabhu
     *
     * @param creditHours The required number of credit hours for the courses. REQUIRED PARAMETER
     * @param majorCode   The optional major code (e.g., "CSCI"). OPTIONAL PARAMETER
     * @param classLevel  The optional class level (e.g., 4000). OPTIONAL PARAMETER
     * @return A list of courses that match the given criteria.
     */
    @GetMapping("/courses")
    public List<Course> getCourses(
            @RequestParam("creditHours") int creditHours,
            @RequestParam(value = "majorCode", required = false) String majorCode,
            @RequestParam(value = "classLevel", required = false) Integer classLevel
    ) {
        // Placeholder return to avoid compilation error.
        // List<Course> courses = fetchCourses(creditHours, majorCode, classLevel);
        return List.of(new Course());  // Replace with actual data once implemented
    }

    /**
     * Retrieves co-requisites for a given course ID or CRN.
     *
     * @param courseId The ID of the course to retrieve co-requisites for. (optional)
     * @param crn The CRN of the course to retrieve co-requisites for. (optional)
     * @return A list of course objects that are co-requisites for the given course.
     */
    @GetMapping("/course/coreqs")
    public List<Course> getCoReqs(
            @RequestParam(value = "courseId", required = false) String courseId,
            @RequestParam(value = "crn", required = false) String crn
    ) {
        // Placeholder return to avoid compilation error.
        // List<Course> coReqs = fetchCoReqs(courseId, crn);
        List<Course> coReqs = new ArrayList<>();
        coReqs.add(new Course()); // Placeholder return to avoid compilation error.
        return coReqs;
    }

    /**
     * Retrieves pre-requisites for a given course ID or CRN.
     *
     * @param courseId The ID of the course to retrieve pre-requisites for. (optional)
     * @param crn The CRN of the course to retrieve pre-requisites for. (optional)
     * @return A list of course objects that are pre-requisites for the given course.
     */
    @GetMapping("/course/prereqs")
    public List<Course> getPreReqs(
            @RequestParam(value = "courseId", required = false) String courseId,
            @RequestParam(value = "crn", required = false) String crn
    ) {
        // Placeholder return to avoid compilation error.
        // List<Course> preReqs = fetchPreReqs(courseId, crn);
        List<Course> preReqs = new ArrayList<>();
        preReqs.add(new Course()); // Placeholder return to avoid compilation error.
        return preReqs;
    }

    // Other endpoints related to Bulletin data could be added here
}

