package AdvJavaPractice.enums;

/*
TASK:okul yönetimi için öğrenci ve teacher silme programı yazınız.
     User için role tanımlayın(ADMIN,TEACHER,STUDENT) ve role göre silme yetkisi veriniz.
     öğrenci silme yetkisi: ADMIN-TEACHER
     teacher silme yetkisi: ADMIN
*/

public class SchoolManagement {
    public static void main(String[] args) {

        Student student = new Student("Tolstoy");
        Teacher teacher = new Teacher("Balzac");

        User user1 = new User("Jules Verne",Role.ROLE_ADMIN);
        User user2 = new User("C.Dickens",Role.ROLE_TEACHER);
        User user3 = new User("J.Steinbeck",Role.ROLE_STUDENT);

        deleteStudent(student,user1);
        deleteStudent(student,user3);
        deleteStudent(student,user2);

        deleteTeacher(teacher,user1);
        deleteTeacher(teacher,user2);
        deleteTeacher(teacher,user3);

    }

    public static void deleteStudent(Student std, User user){

        if(user.getRole().equals(Role.ROLE_ADMIN) || user.getRole().equals(Role.ROLE_TEACHER)){
            System.out.println("Student is DELETED successfully by "+ user.getRole().getName());
        }else {
            System.out.println(user.getRole().getName() + " is not permitted to delete Student.");
        }

    }

    public static void deleteTeacher(Teacher teacher, User user){

        if(user.getRole().equals(Role.ROLE_ADMIN)){
            System.out.println("Teacher is DELETED successfully by "+ user.getRole().getName());
        }else {
            System.out.println(user.getRole().getName() + " is not permitted to delete Teacher.");
        }

    }

}
