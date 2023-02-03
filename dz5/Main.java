package dz5;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        AttendanceService attendanceService = new AttendanceService();

        attendanceService.addAttendance("Иванов", LocalDate.of(2023, 1, 1), true);
        attendanceService.addAttendance("Иванов", LocalDate.of(2023, 1, 2), true);
        attendanceService.addAttendance("Иванов", LocalDate.of(2023, 1, 3), true);
        attendanceService.addAttendance("Иванов", LocalDate.of(2023, 1, 4), true);
        attendanceService.addAttendance("Иванов", LocalDate.of(2023, 1, 5), true);

        attendanceService.addAttendance("Петров", LocalDate.of(2023, 1, 1), true);
        attendanceService.addAttendance("Петров", LocalDate.of(2023, 1, 2), true);
        attendanceService.addAttendance("Петров", LocalDate.of(2023, 1, 3), true);
        attendanceService.addAttendance("Петров", LocalDate.of(2023, 1, 4), true);
        attendanceService.addAttendance("Петров", LocalDate.of(2023, 1, 5), false);


        attendanceService.addAttendance("Сидоров", LocalDate.of(2023, 1, 1), true);
        attendanceService.addAttendance("Сидоров", LocalDate.of(2023, 1, 2), true);
        attendanceService.addAttendance("Сидоров", LocalDate.of(2023, 1, 3), true);
        attendanceService.addAttendance("Сидоров", LocalDate.of(2023, 1, 4), false);
        attendanceService.addAttendance("Сидоров", LocalDate.of(2023, 1, 5), false);

        attendanceService.addAttendance("Козлов", LocalDate.of(2023, 1, 1), true);
        attendanceService.addAttendance("Козлов", LocalDate.of(2023, 1, 2), true);
        attendanceService.addAttendance("Козлов", LocalDate.of(2023, 1, 3), false);
        attendanceService.addAttendance("Козлов", LocalDate.of(2023, 1, 4), false);
        attendanceService.addAttendance("Козлов", LocalDate.of(2023, 1, 5), false);

        attendanceService.addAttendance("Чернов", LocalDate.of(2023, 1, 1), true);
        attendanceService.addAttendance("Чернов", LocalDate.of(2023, 1, 2), false);
        attendanceService.addAttendance("Чернов", LocalDate.of(2023, 1, 3), false);
        attendanceService.addAttendance("Чернов", LocalDate.of(2023, 1, 4), false);
        attendanceService.addAttendance("Чернов", LocalDate.of(2023, 1, 5), false);

        attendanceService.addAttendance("Смирнов", LocalDate.of(2023, 1, 1), false);
        attendanceService.addAttendance("Смирнов", LocalDate.of(2023, 1, 2), false);
        attendanceService.addAttendance("Смирнов", LocalDate.of(2023, 1, 3), false);
        attendanceService.addAttendance("Смирнов", LocalDate.of(2023, 1, 4), false);
        attendanceService.addAttendance("Смирнов", LocalDate.of(2023, 1, 5), false);

        
        AttendanceView attendanceView = new AttendanceView(attendanceService);
        Presenter presenter = new Presenter(attendanceService, attendanceView);

        System.out.println("Журнал посещаемости студентов:");
        presenter.printAllAttendance();

        System.out.println("Посещаемость студентов:");
        presenter.printCurrentAttendance();

        System.out.println("Сортиррованный журнал посещаемости студентов :");
        presenter.printSortedAttendance();

        System.out.println("Журнал студентов с посещаемостью менее 25%:");
        presenter.showLowAttendance();
    }  
}   