package ss10_arrayLisst.LinkedList;

public class Test {
    public static void main(String[] args) {
        class Student {
            private int id;
            private String name;



            public Student(int id, String name) {
                this.id = id;
                this.name = name;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
        MyLinkedList<Student> myLinkedList = new MyLinkedList<>();
        Student student1 = new Student(1, "Nguyễn Hoàng Duy");
        Student student2 = new Student(2, "Nguyễn Văn A");
        Student student3 = new Student(3, "Nguyễn Văn B");
        myLinkedList.addFirat(student1);
        myLinkedList.addFirat(student2);
        myLinkedList.addFirat(student3);

        MyLinkedList<Student> cloneLinkedList=myLinkedList.clone();
        for (int i = 0; i < myLinkedList.size() ; i++) {
            Student student= (Student) cloneLinkedList.get(i);
            System.out.println(student.getName());

        }
    }
}
