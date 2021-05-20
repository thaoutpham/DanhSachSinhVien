public class Main {

        public static void main(String[] args) {
            ManageStudent manageStudent = new ManageStudent();
            manageStudent.add(new Student(101, "Phạm Tuấn Thảo", 20));
            manageStudent.add(new Student(122, "Phạm Quốc Việt", 22));
            manageStudent.add(new Student(103, "Hoàng Phi Hồng", 23));
            manageStudent.add(new Student(104, "Nguyễn Thị Thanh Hồng", 26));
            manageStudent.add(new Student(105, "Trần Thị Sinh", 12));
            manageStudent.add(new Student(106, "Bùi Thanh Xuân", 22));
            manageStudent.display();
            manageStudent.edit("Cường Đô Na", new Student(22, "Chương CC", 95));
            manageStudent.display();
            manageStudent.sortByAge();
            manageStudent.display();
        }
    }

