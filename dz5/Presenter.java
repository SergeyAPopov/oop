package dz5;

import java.time.LocalDate;
import java.util.*;

public class Presenter {
    private AttendanceService attendanceService;
    private AttendanceView attendanceView;

    public Presenter(AttendanceService attendanceService, AttendanceView attendanceView) {
        this.attendanceService = attendanceService;
        this.attendanceView = attendanceView;
    }
    public void printAllAttendance() {
        attendanceView.showAttendance();
    }
    public void printCurrentAttendance() {
        Map<String, Map<LocalDate, Boolean>> Attendance = attendanceService.getLogAttendance();
        for (String student : Attendance.keySet()) {
            Map<LocalDate, Boolean> studentAttendance = Attendance.get(student);
            double gradeAttendance = 100.0 * (double) studentAttendance.values().stream().filter(a -> a).count() / (double) studentAttendance.size();
            System.out.println(student + " : " + gradeAttendance + "%");
        }
        System.out.println();
    }

    public void printSortedAttendance() {
        Map<String, Map<LocalDate, Boolean>> Attendance = attendanceService.getLogAttendance();

        TreeMap<Double, List<String>> sortedLogAttendance = new TreeMap<>();
        for (String student : Attendance.keySet()) {
            Map<LocalDate, Boolean> studentAttendance = Attendance.get(student);
            double attendanceGrade = 100.0 * (double) studentAttendance.values().stream().filter(a -> a).count() / (double) studentAttendance.size();

            if (!sortedLogAttendance.containsKey(attendanceGrade)) {
                sortedLogAttendance.put(attendanceGrade, new ArrayList<>());
            }
            sortedLogAttendance.get(attendanceGrade).add(student);
        }
        for (double attendanceGrade : sortedLogAttendance.descendingKeySet()) {
            System.out.println("Посещаемость: " + attendanceGrade + "%");
            for (String student : sortedLogAttendance.get(attendanceGrade)) {
                System.out.println(student);
            }
            System.out.println();
        }
    }
    
    public void showLowAttendance() {
        Map<String, Map<LocalDate, Boolean>> Attendance = attendanceService.getLogAttendance();

        List<String> studentsLowAttendance = new ArrayList<>();
        for (String student : Attendance.keySet()) {
            Map<LocalDate, Boolean> studentAttendance = Attendance.get(student);

            double attendanceGrade = 100.0 * (double) studentAttendance.values().stream().filter(a -> a).count() / (double) studentAttendance.size();
            if (attendanceGrade <= 25.0) {
                studentsLowAttendance.add(student);
            }
        }
        for (String student : studentsLowAttendance) {
            System.out.println(student);
        }
    }

}
