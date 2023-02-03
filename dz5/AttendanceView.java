package dz5;
import java.time.*;
import java.util.*;

public class AttendanceView {

    private AttendanceService attendanceService;

    public AttendanceView(AttendanceService attendanceService) {
        this.attendanceService = attendanceService;
    }
    
    public void showAttendance() {
        Map<String, Map<LocalDate, Boolean>> attendance = attendanceService.getLogAttendance();

        for (String student : attendance.keySet()) {
            System.out.println(student + ":");
            Map<LocalDate, Boolean> studentAttendance = attendance.get(student);
            for (LocalDate date : studentAttendance.keySet()) {
                System.out.println("\t" + date + "--- " + (studentAttendance.get(date) ? "Присутствовал" : "Отсутствовал"));
            }
            System.out.println();
        }
    }
}
