class Customer extends Person{
    private int balance;
    public Customer(String name, String address, int balance){
        super(name, address);
        this.balance = balance;
    }
    @Override
    public void display(){
        System.out.println("Tên: " + super.getName());
        System.out.println("Địa chỉ: " + super.getAddress());
        System.out.println("Tài khoản: " + balance);
    }

}
