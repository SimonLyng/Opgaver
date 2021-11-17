class Datamtik {
    public static void main(String[] args) {
     Teacher teacher = new Teacher("Torben", 69,false );

     Student student1 = new Student("Simon", 21, false, 'a');
     Student student2 = new Student("Victor", 21, false, 'a');

     System.out.println(teacher.name);

     System.out.println(student1.name+" "+student1.datamatikerTeam);
     System.out.println(student2.name+" "+student2.datamatikerTeam);



    }
}