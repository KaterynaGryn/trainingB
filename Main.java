public class Main {
    public static void main(String[] args) {
        Employee em1 = new Employee(1,"Oleh","Tsivan",Role.RM,5000f,Company.LUXOFT);
//        em1.setId(1);
//        em1.setFirstName("Kate");
//        em1.setLastName("Green");
        System.out.println(em1.getAge());




        em1.hashCode();
    }
}
