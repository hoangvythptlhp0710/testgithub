class Employee extends Person{
    private int salary;
    public Employee(String name, String address, int salary){
        super(name, address);
        this.salary = salary;
    }
    @Override
    public void display(){
        System.out.println("Tên: "+ super.getName());
        System.out.println("Địa chỉ: " + super.getAddress());
        System.out.println("Lương hàng tháng: " + salary);
    }
}
