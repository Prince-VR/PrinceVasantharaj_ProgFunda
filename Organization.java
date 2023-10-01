package Assignment1;
import java.lang.String;

public class Organization {
    public static void main(String[] args) {
        AdminDepartment obj = new AdminDepartment();
        String Ad_Name=obj.departmentName();
        System.out.println("Welcome to the "+Ad_Name);
        String Ad_TodaysWork=obj.getTodaysWork();
        System.out.println(Ad_TodaysWork);
        String Ad_WorkDeadline=obj.getWorkDeadline();
        System.out.println(Ad_WorkDeadline);
        String Ad_TodayAHoliday=obj.isTodayAHoliday();
        System.out.println(Ad_TodayAHoliday);

        System.out.println();

        HrDepartment obj1 = new HrDepartment();
        String Hr_Name=obj1.departmentName();
        System.out.println("Welcome to the "+Hr_Name);
        String Hr_TodaysWork=obj1.getTodaysWork();
        System.out.println(Hr_TodaysWork);
        String Hr_WorkDeadline=obj1.getWorkDeadline();
        System.out.println(Hr_WorkDeadline);
        String Hr_Activity=obj1.doActivity();
        System.out.println(Hr_Activity);
        String Hr_TodayAHoliday=obj1.isTodayAHoliday();
        System.out.println(Hr_TodayAHoliday);

        System.out.println();


        TechDepartment obj2 = new TechDepartment();
        String Tech_Name=obj2.departmentName();
        System.out.println("Welcome to the "+Tech_Name);
        String Tech_TodaysWork=obj2.getTodaysWork();
        System.out.println(Tech_TodaysWork);
        String Tech_WorkDeadline=obj2.getWorkDeadline();
        System.out.println(Tech_WorkDeadline);
        String Tech_Activity=obj2.getTechStackInformation();
        System.out.println(Tech_Activity);
        String Tech_TodayAHoliday=obj2.isTodayAHoliday();
        System.out.println(Tech_TodayAHoliday);


    }
}

    class SuperDepartment {
        public  String departmentName() {
            return "Super Department";
        }
        public  String getTodaysWork() {
            return "No work as of now";
        }
        public  String getWorkDeadline() {
            return "Nil";
        }
        public  String isTodayAHoliday() {
            return "Today is not a holiday";
        }
    }

    class AdminDepartment extends SuperDepartment {
        public   String departmentName() {
            return "Admin Department";
        }
        public   String getTodaysWork() {
            return "Complete your documents submission";
        }
        public   String getWorkDeadline() {
            return "Complete it by EOD";
        }
    }

   class HrDepartment extends SuperDepartment {
        public String departmentName() {
            return "HR Department";
        }
        public String getTodaysWork() {
            return "Fill out today’s timesheet and mark your attendance";
        }
        public String getWorkDeadline() {
            return "Complete it by EOD";
        }
        public String doActivity() {
            return "Team lunch";
        }
    }

    class TechDepartment extends SuperDepartment {
        public String departmentName() {
            return "Tech Department";
        }
        public String getTodaysWork() {
            return "Complete coding of module 1";
        }
        public String getWorkDeadline() {
            return "Complete it by EOD";
        }
        public String getTechStackInformation() {
            return "Core java";
        }
    }













