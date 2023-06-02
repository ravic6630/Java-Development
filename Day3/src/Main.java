public class Main {
    public static void main(String[] args) {
        SubDepartment subDepartment = new SubDepartment(50);
        int size = subDepartment.getDepartmentSize();
        System.out.println("SubDepartment size: " + size);
    }
}