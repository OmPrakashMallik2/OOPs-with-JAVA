public abstract class Bank {
    String name = "B Nath";
    int age = 22;
    int phone = 108;

    abstract void isSee();
    abstract void isContact();
}


class AddBank extends Bank {

    void isSee() {
        // TODO Auto-generated method stub
    }

    void isContact() {
        // TODO Auto-generated method stub
    }  
}

class Atm extends Bank {

    @Override
    void isSee() {
        // TODO Auto-generated method stub
        
    }

    @Override
    void isContact() {
        // TODO Auto-generated method stub
        
    }
    
}