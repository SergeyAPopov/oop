package dz5;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class AttendanceService {
    private Map<String, Map<LocalDate,Boolean>> Attendance;

    public AttendanceService() {
        Attendance = new HashMap<>();
    }

    public void addAttendance(String studentName, LocalDate date, boolean attended) {
        if (!Attendance.containsKey(studentName)) {
            Attendance.put(studentName, new HashMap<>());
        }

        Map<LocalDate, Boolean> studentAttendance = Attendance.get(studentName);
        studentAttendance.put(date, attended);
    }

    public Map<String, Map<LocalDate, Boolean>> getLogAttendance() {
        return Attendance;
    }
}
